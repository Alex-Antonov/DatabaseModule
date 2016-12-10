package my.antonov.database.impl.logic.mappers;

import my.antonov.database.impl.logic.entity.Player;
import my.antonov.database.impl.logic.entity.PlayerMoney;
import org.apache.ibatis.annotations.*;

/**
 * Created by alex on 01.10.2016.
 */
public interface PlayerMoneyMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "player", column = "id_player", javaType = Player.class,
                    one = @One(select = "my.antonov.database.impl.logic.mappers.PlayerMapper.selectPlayerById")),

            @Result(property = "silver", column = "silver"),
            @Result(property = "gold", column = "gold")
    })
    @Select("SELECT id, id_player, silver, gold FROM player_money WHERE id = #{id}")
    PlayerMoney selectPlayerMoneyById(Integer id);

    @Insert("INSERT INTO player_money(id_player, silver, gold) VALUES(#{player.id}, #{silver}, #{gold})")
    void insertNewPlayerMoney(PlayerMoney playerMoney);

    @Update("ALTER TABLE player_money AUTO_INCREMENT = #{ai}")
    void alterAutoIncrement(Integer ai);
}
