package my.antonov.database.impl.logic.entity;

/**
 * Created by alex on 01.10.2016.
 */
public class PlayerMoney {

    private Integer id;
    private Player player;
    private Integer silver;
    private Integer gold;

    public PlayerMoney() {}

    public PlayerMoney(Player player, Integer silver, Integer gold) {
        this.player = player;
        this.silver = silver;
        this.gold = gold;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getSilver() {
        return silver;
    }

    public void setSilver(Integer silver) {
        this.silver = silver;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }
}
