package designs.vendingMachine.dao;

import designs.vendingMachine.models.Item;

import java.util.List;

public interface InventoryDao {

    List<Item> getAvailableItemDetails();

    Item getItemInfo(String itemId);

    void updateItemCount(String itemId,int count);
}
