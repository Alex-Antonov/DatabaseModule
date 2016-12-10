package my.antonov.database.impl.logic.mappers;

import my.antonov.database.impl.logic.entity.Player;
import org.apache.ibatis.annotations.*;

/**
 * Created by alex on 29.09.2016.
 */
public interface PlayerMapper {

    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "login", column = "login"),
        @Result(property = "password", column = "password"),
        @Result(property = "email", column = "email")
    })
    @Select("SELECT id, login, password, email FROM player WHERE id = #{id}")
    Player selectPlayerById(int id);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "login", column = "login"),
            @Result(property = "password", column = "password"),
            @Result(property = "email", column = "email")
    })
    @Select("SELECT id, login, password, email FROM player WHERE login = #{login}")
    Player selectPlayerByLogin(String login);

    @Insert("INSERT INTO player(login, password, email) VALUES(#{login}, #{password}, #{email})")
    void insertNewPlayer(Player player);

    @Select("SELECT login FROM player WHERE login = #{login}")
    String selectLogin(String login);

    @Select("SELECT email FROM player WHERE login = #{email}")
    String selectEmail(String email);

    @Select("SELECT AUTO_INCREMENT FROM information_schema.TABLES WHERE TABLE_SCHEMA='labyrinth_db' AND TABLE_NAME='player'")
    Integer getNextId();

    @Update("ALTER TABLE player AUTO_INCREMENT = #{ai}")
    void alterAutoIncrement(Integer ai);
}
