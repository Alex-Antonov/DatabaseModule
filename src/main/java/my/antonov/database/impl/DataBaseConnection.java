package my.antonov.database.impl;

import my.antonov.database.DataBase;
import my.antonov.database.impl.logic.DataBaseDAO;

/**
 * Created by alex on 28.09.2016.
 */
public class DataBaseConnection implements DataBase {

    public DataBaseConnection() {

    }

    public boolean registrateNewPlayer(String login, String password, String email) {
        return new DataBaseDAO().registrateNewPlayer(login, password, email);
    }

    public boolean autorization(String login, String password) {
        return new DataBaseDAO().autorization(login, password);
    }

}
