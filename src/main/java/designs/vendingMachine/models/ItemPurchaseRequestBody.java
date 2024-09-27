package designs.vendingMachine.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ItemPurchaseRequestBody {

    private String itemId;

    private int insertedAmount;

    private int  quantity;
}
