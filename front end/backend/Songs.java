
import java.sql.*;

public class Songs {

    public static void displaySongs() throws Exception {

        Connection con = Database.getConnection();

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM songs");

        while (rs.next()) {

            System.out.println("Song Name: " +
                rs.getString("song_name"));

            System.out.println("Artist: " +
                rs.getString("artist"));

            System.out.println("----------------");
        }

        con.close();
    }
}
