import GUI.LoginPage;
import connection.DBConnection;

import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {
        LoginPage loginPage = new LoginPage("Online shop");
        loginPage.setVisible(true);
        DBConnection dbConnection = new DBConnection();
    }
}