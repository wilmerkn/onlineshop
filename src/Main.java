import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://pgserver.mau.se/am2647";
        Properties props = new Properties();
        props.setProperty("user","am2647");
        props.setProperty("password","qncs2hgw");
        props.setProperty("ssl","false");

        //QUERY
        String query = String.format("SELECT * FROM customer");

        Connection conn = DriverManager.getConnection(url,props);

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getString(2));
        }
    }
}