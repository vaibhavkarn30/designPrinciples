package designs.vendingMachine.service;


import designs.vendingMachine.dao.InventoryDao;
import designs.vendingMachine.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryDao inventoryDao;

    public List<Item> getAllAvailableItems() {
        return inventoryDao.getAvailableItemDetails();
    }

    public Item getItem(String itemId){
        return inventoryDao.getItemInfo(itemId);
    }

    //Might have to take a distributed lock on this item if concurrency is a use case
    public void updateItemCount(String itemId,int itemCount) {
        inventoryDao.updateItemCount(itemId,itemCount);
    }
}
