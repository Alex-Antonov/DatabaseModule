package my.antonov.database.impl.logic.dao;

import my.antonov.database.impl.logic.entity.PlayerMoney;
import my.antonov.database.impl.logic.mappers.PlayerMoneyMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by alex on 01.10.2016.
 */
public class PlayerMoneyDAO {

    public void addNewPlayerMoney(SqlSession session, PlayerMoney playerMoney) {
        PlayerMoneyMapper playerMoneyMapper = session.getMapper(PlayerMoneyMapper.class);
        playerMoneyMapper.insertNewPlayerMoney(playerMoney);
    }

    public PlayerMoney getPlayerMoneyById(SqlSession session, Integer id) {
        PlayerMoneyMapper playerMoneyMapper = session.getMapper(PlayerMoneyMapper.class);
        PlayerMoney playerMoney = playerMoneyMapper.selectPlayerMoneyById(id);
        return playerMoney;
    }

    public void alterAutoIncrement(SqlSession session, Integer ai) {
        session.getMapper(PlayerMoneyMapper.class).alterAutoIncrement(ai);
    }
}
