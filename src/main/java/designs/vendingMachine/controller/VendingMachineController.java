package designs.vendingMachine.controller;

import designs.vendingMachine.models.Item;
import designs.vendingMachine.models.ItemPurchaseRequestBody;
import designs.vendingMachine.models.ListItemResponse;
import designs.vendingMachine.models.OrderDetails;
import designs.vendingMachine.models.PurchaseDetails;
import designs.vendingMachine.service.InventoryService;
import designs.vendingMachine.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class VendingMachineController {

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/vending-machine/items")

    public ResponseEntity<ListItemResponse> listAvailableItems(){
        List<Item> availableItems = inventoryService.getAllAvailableItems();
        ListItemResponse listItemResponse = ListItemResponse
                .builder().availableItemDetails(availableItems).build();
        return ResponseEntity.ok(listItemResponse);
    }

    @PostMapping(value = "/vending-machine/item/purchase",consumes = "application/json")
    public ResponseEntity<PurchaseDetails> purchaseItem(@RequestBody ItemPurchaseRequestBody itemPurchaseRequestBody){

        // I can also apply mapper pattern here
        OrderDetails orderDetails = OrderDetails.builder()
                        .itemId(itemPurchaseRequestBody.getItemId())
                                .quantity(itemPurchaseRequestBody.getQuantity())
                                        .amount(itemPurchaseRequestBody.getInsertedAmount()).build();

        PurchaseDetails purchaseDetails = orderService.purchaseItem(orderDetails);
        return ResponseEntity.ok(purchaseDetails);
    }


}
