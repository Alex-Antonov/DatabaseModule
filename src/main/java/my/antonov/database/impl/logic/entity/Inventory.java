package my.antonov.database.impl.logic.entity;

/**
 * Created by alex on 01.10.2016.
 */
public class Inventory {

    private Integer id;
    private String name;
    private Integer priceSilver;
    private Integer priceGold;
    private String description;

    public Inventory() {

    }

    public Inventory(Integer id) {
        this.id = id;
    }

    public Inventory(String name, Integer priceSilver,
                     Integer priceGold, String description) {
        this.name = name;
        this.priceSilver = priceSilver;
        this.priceGold = priceGold;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriceSilver() {
        return priceSilver;
    }

    public void setPriceSilver(Integer priceSilver) {
        this.priceSilver = priceSilver;
    }

    public Integer getPriceGold() {
        return priceGold;
    }

    public void setPriceGold(Integer priceGold) {
        this.priceGold = priceGold;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
