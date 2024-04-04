package designs.vendingMachine.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@AllArgsConstructor
@Setter
public class Item {
    private String id;

    private String name;
    private int quantity;
    private int price;
}
