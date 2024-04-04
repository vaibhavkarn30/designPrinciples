package designs.vendingMachine.strategy;

import designs.vendingMachine.exception.PurchaseException;
import designs.vendingMachine.models.Item;
import designs.vendingMachine.models.OrderDetails;
import designs.vendingMachine.models.PurchaseDetails;
import designs.vendingMachine.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ExactPriceBasedPurchaseStrategy implements PurchaseStrategy {
    @Autowired
    InventoryService inventoryService;
    @Override
    public PurchaseDetails purchaseItem(OrderDetails orderDetails) throws PurchaseException {

        Item item = inventoryService.getItem(orderDetails.getItemId());

        if(item.getQuantity()<orderDetails.getQuantity()){
            throw new PurchaseException("QUANTITY EXCEEDING CURRENT QUANTITY");
        }

        int totalAmountNeeded = orderDetails.getQuantity() * item.getPrice();
        int amountInserted = orderDetails.getAmount();

        if(totalAmountNeeded!=amountInserted){
            throw new PurchaseException(String.format("INSERTED AMOUNT REQUIRED IS NOT EXACT, THE REQUIRE AMOUNT IS = %d",totalAmountNeeded));
        }

        inventoryService.updateItemCount(orderDetails.getItemId(),item.getQuantity()- orderDetails.getQuantity());

        return PurchaseDetails
                .builder()
                .purchaseStatus(true)
                .purchaseId(UUID.randomUUID().toString())
                .purchaseMessage("PURCHASE SUCCESSFUL")
                .build();

    }
}
