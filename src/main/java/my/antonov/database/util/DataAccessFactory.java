package my.antonov.database.util;

/**
 * Created by alex on 28.09.2016.
 */
public class DataAccessFactory {

    private static final DataAccessFactory instance = new DataAccessFactory();
    private JDBCUtil jdbcUtil;

    private DataAccessFactory() {
    }

    public static DataAccessFactory getInstance() {
        return instance;
    }

    private JDBCUtil prepareJDBCUtils() {
        if (jdbcUtil == null) {
            jdbcUtil = new JDBCUtil();
            jdbcUtil.init("jdbc/mysql-labyrinthdb");
        }

        return jdbcUtil;
    }

    public static synchronized JDBCUtil getJDBCUtils() {
        return getInstance().prepareJDBCUtils();
    }
}
