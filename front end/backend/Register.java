
import java.sql.*;

public class Register {

    public static String register(
        String username, String email, String password)
        throws Exception {

        Connection con = Database.getConnection();

        String sql = "INSERT INTO users " +
                     "(username,email,password) VALUES (?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, email);
        ps.setString(3, password);

        ps.executeUpdate();

        con.close();

        return "Registration Successful!";
    }
}
