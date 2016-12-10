package my.antonov.database;

/**
 * Created by alex on 28.09.2016.
 */
public interface DataBase {

    boolean registrateNewPlayer(String login, String password, String email);

    boolean autorization(String login, String password);
}
