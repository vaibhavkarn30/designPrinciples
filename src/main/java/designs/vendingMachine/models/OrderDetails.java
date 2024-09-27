package designs.vendingMachine.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class OrderDetails {
    private String itemId;
    private int amount;
    private int quantity;
}
