package my.antonov.database;

import my.antonov.database.impl.DataBaseConnection;

/**
 * Created by alex on 28.09.2016.
 */
public class DataBaseManager {

    public static DataBase getDataBaseConnection() {
        return new DataBaseConnection();
    }
}
