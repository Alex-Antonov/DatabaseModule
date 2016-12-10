package my.antonov.database.impl.logic.mappers;

import my.antonov.database.impl.logic.entity.Player;
import my.antonov.database.impl.logic.entity.PlayerStatistic;
import org.apache.ibatis.annotations.*;

/**
 * Created by alex on 30.09.2016.
 */
public interface PlayerStatisticMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "player", column = "id_player", javaType = Player.class,
                one = @One(select = "my.antonov.database.impl.logic.mappers.PlayerMapper.selectPlayerById")),

            @Result(property = "gamesCount", column = "games_count"),
            @Result(property = "winsCount", column = "wins_count")
    })
    @Select("SELECT id, id_player, games_count, wins_count FROM player_statistic WHERE id = #{id}")
    PlayerStatistic selectStatisticById(Integer id);

    @Insert("INSERT INTO player_statistic(id_player, games_count, wins_count) VALUES(#{player.id}, #{gamesCount}, #{winsCount})")
    void insertNewStaticstic(PlayerStatistic statistic);

    @Update("ALTER TABLE player_statistic AUTO_INCREMENT = #{ai}")
    void alterAutoIncrement(Integer ai);
}
