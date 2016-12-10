package my.antonov.database.impl.logic.entity;

/**
 * Created by alex on 29.09.2016.
 */
public class PlayerStatistic {

    private Integer id;
    private Player player;
    private Integer gamesCount;
    private Integer winsCount;

    public PlayerStatistic() {}

    public PlayerStatistic(Player player, Integer gamesCount, Integer winsCount) {
        this.player = player;
        this.gamesCount = gamesCount;
        this.winsCount = winsCount;
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

    public Integer getGamesCount() {
        return gamesCount;
    }

    public void setGamesCount(Integer games_count) {
        this.gamesCount = games_count;
    }

    public Integer getWinsCount() {
        return winsCount;
    }

    public void setWinsCount(Integer wins_count) {
        this.winsCount = wins_count;
    }
}
