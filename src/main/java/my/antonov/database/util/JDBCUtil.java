package my.antonov.database.util;

import org.apache.log4j.Logger;

import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by alex on 28.09.2016.
 */
public class JDBCUtil {

    private static final Logger log = Logger.getLogger(JDBCUtil.class);
    private DataSource dataSource;

    public JDBCUtil() {

    }

    public void init(String dataSourceName) {
        try {
            InitialContext initContext = new InitialContext();
            dataSource = (DataSource) initContext.lookup(dataSourceName);
        } catch (NamingException e) {
            log.error("JNDIException: {0}", e);
        }
    }

    public Connection getConnection() throws SQLException {
        if(dataSource == null) {
            throw new SQLException("DataSourse is null.");
        }

        return dataSource.getConnection();
    }
}
