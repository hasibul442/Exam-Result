
package result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main {
    private static Connection con = null;
    
    public static Connection dbConnect(){
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:F:\\Result\\Database\\ExamSch.sqlite");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
       JOptionPane.showMessageDialog(null, e);
        return null;
        }

    }
}
