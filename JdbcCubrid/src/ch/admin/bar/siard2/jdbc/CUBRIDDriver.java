package ch.admin.bar.siard2.jdbc;

import ch.enterag.utils.jdbc.BaseDriver;
import ch.enterag.utils.logging.IndentLogger;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class CUBRIDDriver extends BaseDriver implements Driver {
    private static IndentLogger _il;
    public static final String sCUBRID_SCHEME = "cubrid";
    public static final String sCUBRID_URL_PREFIX = "jdbc:cubrid:";

    public CUBRIDDriver() {
    }

    public static String getUrl(String sDatabaseName, boolean bNoSsl) {
        String sUrl = sDatabaseName;
        if (!sUrl.startsWith(sCUBRID_URL_PREFIX)) {
            sUrl = sCUBRID_URL_PREFIX + "//" + sDatabaseName;
        }
        if (bNoSsl) {
            sUrl = sUrl + "?verifyServerCertificate=false&useSSL=false&requireSSL=false";
        }
        return sUrl;
    }

    public static void register() {
        try {
            BaseDriver.register(new CUBRIDDriver(), "cubrid.jdbc.driver.CUBRIDDriver", "jdbc:cubrid:localhost:33000:demodb:public::");
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public boolean acceptsURL(String url) throws SQLException {
        _il.enter(url);
        boolean bAccepts = url.startsWith("jdbc:cubrid:");
        _il.exit(bAccepts);
        return bAccepts;
    }

    public Connection connect(String url, Properties info) throws SQLException {
        _il.enter(url, info);
        if (info == null) {
            info = new Properties();
        }
        info.setProperty("useCursorFetch", "true");
        info.setProperty("defaultFetchSize", "1");
        info.setProperty("enableEscapeProcessing", "false");
        info.setProperty("processEscapeCodesForPrepStmts", "false");
        info.setProperty("sessionVariables", "sql_mode='ANSI,NO_BACKSLASH_ESCAPES'");
        Connection conn = super.connect(url, info);
        if (conn != null) {
            conn = new CUBRIDConnection(conn);
        }
        _il.exit(conn);
        return conn;
    }

    static {
        System.setProperty("jdbc.drivers", "cubrid.jdbc.driver.CUBRIDDriver");
        _il = IndentLogger.getIndentLogger(CUBRIDDriver.class.getName());
        register();
    }
}
