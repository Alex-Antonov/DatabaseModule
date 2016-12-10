package my.antonov.database.impl.logic.mappers;

import my.antonov.database.impl.logic.entity.Inventory;
import my.antonov.database.impl.logic.entity.Player;
import org.apache.ibatis.annotations.*;

/**
 * Created by alex on 01.10.2016.
 */
public interface InventoryMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "priceSilver", column = "price_silver"),
            @Result(property = "priceGold", column = "price_gold")
    })
    @Select("SELECT id, name, price_silver, price_gold FROM inventory WHERE id = #{id}")
    Inventory selectInventoryById(Integer id);

    @Insert("INSERT INTO inventory(name, price_silver, price_gold) VALUES(#{name}, #{priceSilver}, #{priceGold})")
    void insertNewInventory(Inventory inventory);
}
