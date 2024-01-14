import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebms", "root", "admin"); // replace the password according to your account
            s = c.createStatement();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}