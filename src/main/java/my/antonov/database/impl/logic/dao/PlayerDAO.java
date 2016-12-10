package my.antonov.database.impl.logic.dao;

import my.antonov.database.impl.logic.entity.Player;
import my.antonov.database.impl.logic.mappers.PlayerMapper;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by alex on 29.09.2016.
 */
public class PlayerDAO {

    public void addNewPlayer(SqlSession session, Player player) throws PersistenceException {
        PlayerMapper playerMapper = session.getMapper(PlayerMapper.class);
        playerMapper.insertNewPlayer(player);
    }

    public Player getPlayerById(SqlSession session, Integer id) {
        PlayerMapper playerMapper = session.getMapper(PlayerMapper.class);
        Player player = playerMapper.selectPlayerById(id);
        return player;
    }

    public Player getPlayerByLogin(SqlSession session, String login) {
        PlayerMapper playerMapper = session.getMapper(PlayerMapper.class);
        Player player = playerMapper.selectPlayerByLogin(login);
        return player;
    }

    public Integer getNextId(SqlSession session) {
        PlayerMapper playerMapper = session.getMapper(PlayerMapper.class);
        return playerMapper.getNextId();
    }

    public boolean isLoginExist(SqlSession session, String login) {
        PlayerMapper playerMapper = session.getMapper(PlayerMapper.class);
        return (playerMapper.selectLogin(login) != null);
    }

    public boolean isEmailExist(SqlSession session, String email) {
        PlayerMapper playerMapper = session.getMapper(PlayerMapper.class);
        return (playerMapper.selectEmail(email) != null);
    }

    public void alterAutoIncrement(SqlSession session, Integer ai) {
        session.getMapper(PlayerMapper.class).alterAutoIncrement(ai);
    }
}
