package connection;
import java.sql.*;
import java.util.Properties;


public class DBConnection {

    public DBConnection() throws SQLException {
        String url = "jdbc:postgresql://pgserver.mau.se/ah0773";
        Properties props = new Properties();
        props.setProperty("user","ah0773");
        props.setProperty("password","8raifz4k");
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