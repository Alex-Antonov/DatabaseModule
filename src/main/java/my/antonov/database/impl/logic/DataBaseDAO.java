package my.antonov.database.impl.logic;

import my.antonov.database.impl.logic.dao.PlayerDAO;
import my.antonov.database.impl.logic.dao.PlayerInventoryDAO;
import my.antonov.database.impl.logic.dao.PlayerMoneyDAO;
import my.antonov.database.impl.logic.dao.PlayerStatisticDAO;
import my.antonov.database.impl.logic.entity.*;
import my.antonov.database.util.DataAccessFactory;
import my.antonov.database.util.JDBCUtil;
import my.antonov.database.util.MyBatisUtil;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 * Created by alex on 29.09.2016.
 */
public class DataBaseDAO {

    private static final Logger log = Logger.getLogger(DataBaseDAO.class);
    private JDBCUtil jdbcUtil;

    public DataBaseDAO() {
        //jdbcUtil = DataAccessFactory.getJDBCUtils();
    }

    public boolean registrateNewPlayer(String login, String password, String email) {
        boolean result = true;
        Player player = new Player(login, password, email);
        PlayerMoney playerMoney = new PlayerMoney(player, 100, 1);
        PlayerStatistic statistic = new PlayerStatistic(player, 0, 0);
        PlayerInventory basicInventory = new PlayerInventory(player, 3, 2, 3, 1);

        PlayerDAO playerDAO = new PlayerDAO();
        PlayerMoneyDAO playerMoneyDAO = new PlayerMoneyDAO();
        PlayerStatisticDAO playerStatisticDAO = new PlayerStatisticDAO();
        PlayerInventoryDAO playerInventoryDAO = new PlayerInventoryDAO();

        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Integer nextId = 0;
        try {

            if(playerDAO.isLoginExist(session, login)) {
                log.error("Duplicate 'login' insert: " + login);
                result = false;
            }

            if(playerDAO.isEmailExist(session, email)) {
                log.error("Duplicate 'email' insert: " + email);
                result = false;
            }

            nextId = playerDAO.getNextId(session);

            player.setId(nextId);
            playerDAO.addNewPlayer(session, player);

            playerMoneyDAO.addNewPlayerMoney(session, playerMoney);

            playerStatisticDAO.addNewStatistic(session, statistic);

            playerInventoryDAO.addNewPlayerInventory(session, basicInventory);

            session.commit();
        } catch(Exception e) {
            log.trace("Registrate new player problem", e);
            playerDAO.alterAutoIncrement(session, nextId);
            playerInventoryDAO.alterAutoIncrement(session, nextId);
            playerMoneyDAO.alterAutoIncrement(session, nextId);
            playerStatisticDAO.alterAutoIncrement(session, nextId);
            result = false;
        } finally {
            session.close();
        }

        return result;
    }

    public boolean autorization(String login, String password) {
        boolean result = false;

        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Player player = new PlayerDAO().getPlayerByLogin(session, login);
        session.close();

        if(player != null && player.getLogin().equals(login) && player.getPassword().equals(password))
            result = true;
        return result;
    }
}
