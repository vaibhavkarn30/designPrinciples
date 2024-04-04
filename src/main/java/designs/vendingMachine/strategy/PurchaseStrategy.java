package designs.vendingMachine.strategy;

import designs.vendingMachine.exception.PurchaseException;
import designs.vendingMachine.models.OrderDetails;
import designs.vendingMachine.models.PurchaseDetails;

public interface PurchaseStrategy {
    PurchaseDetails purchaseItem(OrderDetails orderDetails) throws PurchaseException;
}
