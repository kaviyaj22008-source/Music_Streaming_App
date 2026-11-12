
import java.sql.*;

public class Login {

    public static boolean checkLogin(
        String email, String password) throws Exception {

        Connection con = Database.getConnection();

        String sql = "SELECT * FROM users WHERE email=? AND password=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, email);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        boolean result = rs.next();

        con.close();

        return result;
    }
}
