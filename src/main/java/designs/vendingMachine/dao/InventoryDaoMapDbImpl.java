package designs.vendingMachine.dao;


import designs.vendingMachine.models.Item;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class InventoryDaoMapDbImpl implements InventoryDao {

    private static Map<String, Item> itemDetailsMap = new HashMap<>();

    static {
        // Populate the map with initial item details
        itemDetailsMap.put("item1", new Item("item1","coke",3,10));
        itemDetailsMap.put("item2", new Item("item2","chips",4,20));
        itemDetailsMap.put("item3", new Item("item3","chocolate",5,50));
    }


    /**
     * returns a list
     * @return
     */
    @Override
    public List<Item> getAvailableItemDetails() {
        return Collections.unmodifiableList(itemDetailsMap.entrySet()
                .stream().
                map(e->e.getValue()).
                collect(Collectors.toList()));

    }

    @Override
    public Item getItemInfo(String itemId){
        return itemDetailsMap.get(itemId);
    }

    @Override
    public void updateItemCount(String itemId, int count) {
        itemDetailsMap.get(itemId).setQuantity(count);
    }
}
