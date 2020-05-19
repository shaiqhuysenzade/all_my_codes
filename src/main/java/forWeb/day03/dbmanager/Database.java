package forWeb.day03.dbmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
   public  Connection conn = null;
    public PreparedStatement pr = null;
    public ResultSet rs = null;

    void closeAll() {
        try {
            if (conn != null) {
                conn.close();
            }
            if (pr != null) {
                pr.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
