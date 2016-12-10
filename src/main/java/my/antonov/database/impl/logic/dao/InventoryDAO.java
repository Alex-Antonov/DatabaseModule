package my.antonov.database.impl.logic.dao;

import my.antonov.database.impl.logic.entity.Inventory;
import my.antonov.database.impl.logic.mappers.InventoryMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by alex on 01.10.2016.
 */
public class InventoryDAO {

    public void addNewInventory(SqlSession session, Inventory inventory) {
        InventoryMapper inventoryMapper = session.getMapper(InventoryMapper.class);
        inventoryMapper.insertNewInventory(inventory);
    }

    public Inventory getInventory(SqlSession session, Integer id) {
        InventoryMapper inventoryMapper = session.getMapper(InventoryMapper.class);
        Inventory inventory = inventoryMapper.selectInventoryById(id);
        return inventory;
    }
}
