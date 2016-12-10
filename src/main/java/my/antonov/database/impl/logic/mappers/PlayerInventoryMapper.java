package my.antonov.database.impl.logic.mappers;

import my.antonov.database.impl.logic.entity.*;
import org.apache.ibatis.annotations.*;

/**
 * Created by alex on 01.10.2016.
 */
public interface PlayerInventoryMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "player", column = "id_player", javaType = Player.class,
                    one = @One(select = "my.antonov.database.impl.logic.mappers.PlayerMapper.selectPlayerById")),

            @Result(property = "patron", column = "patron"),
            @Result(property = "mine", column = "mine"),
            @Result(property = "dynamite", column = "dynamite"),
            @Result(property = "backpack", column = "backpack"),
            @Result(property = "mineDetector", column = "mine_detector"),
            @Result(property = "bulletproof", column = "bulletproof"),
            @Result(property = "medpack", column = "medpack"),
            @Result(property = "antiSplitter", column = "anti_splitter"),
            @Result(property = "flashLight", column = "flash_light"),
            @Result(property = "beacon", column = "beacon"),
            @Result(property = "thermalImager", column = "thermal_imager"),
            @Result(property = "tipster", column = "tipster"),
            @Result(property = "outputCompas", column = "output_compas"),
            @Result(property = "goldminer", column = "goldminer"),
            @Result(property = "mapmaker", column = "mapmaker"),
    })
    @Select("SELECT id, id_player, patron, mine, dynamite, backpack, mine_detector, " +
            "bulletproof, medpack, anti_splitter, flash_light, beacon, thermal_imager," +
            "tipster, output_compas, goldminer, mapmaker FROM player_inv WHERE id = #{id}")
    PlayerInventory selectPlayerInventoryById(Integer id);

    @Insert("INSERT INTO player_inv(id_player, patron, mine, dynamite, backpack, mine_detector, " +
            "bulletproof, medpack, anti_splitter, flash_light, beacon, thermal_imager, " +
            "tipster, output_compas, goldminer, mapmaker) " +
            "VALUES(#{player.id}, #{patron}, #{mine}, #{dynamite}, #{backpack}, #{mineDetector}, " +
            "#{bulletproof}, #{medpack}, #{antiSplitter}, #{flashLight}, #{beacon}, #{thermalImager}, " +
            "#{tipster}, #{outputCompas}, #{goldminer}, #{mapmaker})")
    void insertNewPlayerInventory(PlayerInventory playerInventory);

    @Update("ALTER TABLE player_inv AUTO_INCREMENT = #{ai}")
    void alterAutoIncrement(Integer ai);
}

