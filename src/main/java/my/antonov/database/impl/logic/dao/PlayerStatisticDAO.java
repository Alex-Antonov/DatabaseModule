package my.antonov.database.impl.logic.dao;


import my.antonov.database.impl.logic.entity.PlayerStatistic;
import my.antonov.database.impl.logic.mappers.PlayerStatisticMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by alex on 30.09.2016.
 */
public class PlayerStatisticDAO {

    public void addNewStatistic(SqlSession session, PlayerStatistic statistic) {
        PlayerStatisticMapper statisticMapper = session.getMapper(PlayerStatisticMapper.class);
        statisticMapper.insertNewStaticstic(statistic);
    }

    public PlayerStatistic getStatisticById(SqlSession session, Integer id) {
        PlayerStatisticMapper statisticMapper = session.getMapper(PlayerStatisticMapper.class);
        PlayerStatistic statistic = statisticMapper.selectStatisticById(id);
        return statistic;
    }

    public void alterAutoIncrement(SqlSession session, Integer ai) {
        session.getMapper(PlayerStatisticMapper.class).alterAutoIncrement(ai);
    }
}
