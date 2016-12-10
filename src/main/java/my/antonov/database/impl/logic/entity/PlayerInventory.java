package my.antonov.database.impl.logic.entity;

/**
 * Created by alex on 01.10.2016.
 */
public class PlayerInventory {

    private Integer id;
    private Player player;
    private Integer patron;
    private Integer mine;
    private Integer dynamite;
    private Integer backpack;
    private Integer mineDetector;
    private Integer bulletproof;
    private Integer medpack;
    private Integer antiSplitter;
    private Integer flashLight;
    private Integer beacon;
    private Integer thermalImager;
    private Integer tipster;
    private Integer outputCompas;
    private Integer goldminer;
    private Integer mapmaker;

    public PlayerInventory() {}

    public PlayerInventory(Player player, Integer patron, Integer mine,
                           Integer dynamite, Integer backpack) {
        this.player = player;
        this.patron = patron;
        this.mine = mine;
        this.dynamite = dynamite;
        this.backpack = backpack;
        this.mineDetector = 0;
        this.bulletproof = 0;
        this.medpack = 0;
        this.antiSplitter = 0;
        this.flashLight = 0;
        this.beacon = 0;
        this.thermalImager = 0;
        this.tipster = 0;
        this.outputCompas = 0;
        this.goldminer = 0;
        this.mapmaker = 0;
    }

    public PlayerInventory(Player player, Integer patron, Integer mine,
                           Integer dynamite, Integer backpack, Integer mineDetector,
                           Integer bulletproof, Integer medpack, Integer antiSplitter,
                           Integer flashLight, Integer beacon, Integer thermalImager,
                           Integer tipster, Integer outputCompas, Integer goldminer, Integer mapmaker) {
        this.player = player;
        this.patron = patron;
        this.mine = mine;
        this.dynamite = dynamite;
        this.backpack = backpack;
        this.mineDetector = mineDetector;
        this.bulletproof = bulletproof;
        this.medpack = medpack;
        this.antiSplitter = antiSplitter;
        this.flashLight = flashLight;
        this.beacon = beacon;
        this.thermalImager = thermalImager;
        this.tipster = tipster;
        this.outputCompas = outputCompas;
        this.goldminer = goldminer;
        this.mapmaker = mapmaker;
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

    public Integer getPatron() {
        return patron;
    }

    public void setPatron(Integer patron) {
        this.patron = patron;
    }

    public Integer getMine() {
        return mine;
    }

    public void setMine(Integer mine) {
        this.mine = mine;
    }

    public Integer getDynamite() {
        return dynamite;
    }

    public void setDynamite(Integer dynamite) {
        this.dynamite = dynamite;
    }

    public Integer getBackpack() {
        return backpack;
    }

    public void setBackpack(Integer backpack) {
        this.backpack = backpack;
    }

    public Integer getMineDetector() {
        return mineDetector;
    }

    public void setMineDetector(Integer mineDetector) {
        this.mineDetector = mineDetector;
    }

    public Integer getBulletproof() {
        return bulletproof;
    }

    public void setBulletproof(Integer bulletproof) {
        this.bulletproof = bulletproof;
    }

    public Integer getMedpack() {
        return medpack;
    }

    public void setMedpack(Integer medpack) {
        this.medpack = medpack;
    }

    public Integer getAntiSplitter() {
        return antiSplitter;
    }

    public void setAntiSplitter(Integer antiSplitter) {
        this.antiSplitter = antiSplitter;
    }

    public Integer getFlashLight() {
        return flashLight;
    }

    public void setFlashLight(Integer flashLight) {
        this.flashLight = flashLight;
    }

    public Integer getBeacon() {
        return beacon;
    }

    public void setBeacon(Integer beacon) {
        this.beacon = beacon;
    }

    public Integer getThermalImager() {
        return thermalImager;
    }

    public void setThermalImager(Integer thermalImager) {
        this.thermalImager = thermalImager;
    }

    public Integer getTipster() {
        return tipster;
    }

    public void setTipster(Integer tipster) {
        this.tipster = tipster;
    }

    public Integer getOutputCompas() {
        return outputCompas;
    }

    public void setOutputCompas(Integer outputCompas) {
        this.outputCompas = outputCompas;
    }

    public Integer getGoldminer() {
        return goldminer;
    }

    public void setGoldminer(Integer goldminer) {
        this.goldminer = goldminer;
    }

    public Integer getMapmaker() {
        return mapmaker;
    }

    public void setMapmaker(Integer mapmaker) {
        this.mapmaker = mapmaker;
    }
}
