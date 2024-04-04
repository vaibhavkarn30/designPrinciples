package designs.vendingMachine.service;

import designs.vendingMachine.exception.PurchaseException;
import designs.vendingMachine.models.OrderDetails;
import designs.vendingMachine.models.PurchaseDetails;
import designs.vendingMachine.strategy.PurchaseStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    InventoryService inventoryService;

    @Autowired
    PurchaseStrategy purchaseStrategy;

    public PurchaseDetails purchaseItem(OrderDetails orderDetails){
        try {
            return purchaseStrategy.purchaseItem(orderDetails);
        } catch (PurchaseException e) {
            return PurchaseDetails.builder()
                    .purchaseStatus(false)
                    .purchaseMessage(e.getMessage())
                    .build();
        }
    }
}
