import java.sql.*;
import javax.swing.*;

public class SQLiteConnection {
    Connection conn = null;
    public static Connection dbConnector() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Developer/Java/PetClinic/src/PetClinic.sqlite");
            System.out.println("Connected to database");
            return conn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
