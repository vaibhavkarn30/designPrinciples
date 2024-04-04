package designs.vendingMachine.models;


import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder

public class PurchaseDetails {

    private boolean purchaseStatus;

    private String purchaseId;
    private String purchaseMessage;


}
