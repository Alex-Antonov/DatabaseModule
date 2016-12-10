package my.antonov.database.impl.logic.dao;

import my.antonov.database.impl.logic.entity.PlayerInventory;
import my.antonov.database.impl.logic.mappers.PlayerInventoryMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by alex on 01.10.2016.
 */
public class PlayerInventoryDAO {

    public void addNewPlayerInventory(SqlSession session, PlayerInventory playerInventory) {
        PlayerInventoryMapper playerInventoryMapper= session.getMapper(PlayerInventoryMapper.class);
        playerInventoryMapper.insertNewPlayerInventory(playerInventory);
    }

    public PlayerInventory getPlayerInventory(SqlSession session, Integer id) {
        PlayerInventoryMapper playerInventoryMapper = session.getMapper(PlayerInventoryMapper.class);
        PlayerInventory playerInventory = playerInventoryMapper.selectPlayerInventoryById(id);
        return playerInventory;
    }

    public void alterAutoIncrement(SqlSession session, Integer ai) {
        session.getMapper(PlayerInventoryMapper.class).alterAutoIncrement(ai);
    }

}
