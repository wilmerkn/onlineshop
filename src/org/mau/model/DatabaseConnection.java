package org.mau.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class DatabaseConnection {
    private Login login;
    private String databaseURL;
    private Properties p;
    private ArrayList<Product> productList;

    public DatabaseConnection() {
        productList = new ArrayList<Product>();
        this.p = new Properties();
        this.p.setProperty("user","ah0773");
        this.p.setProperty("password","8raifz4k");
        this.p.setProperty("ssl","false");
        this.databaseURL = "jdbc:postgresql://pgserver.mau.se/ah0773";

    }

    public void query() {

        productList.clear();

        try {
            String query = String.format("SELECT product_name, base_price,quantity, company_name FROM stock\n" +
                    "INNER JOIN product ON stock.product_id = product.product_id AND stock.supplier_id = product.supplier_id\n" +
                    "INNER JOIN supplier ON supplier.supplier_id = product.supplier_id\n" +
                    "WHERE quantity >= 0 ");
            Connection conn = DriverManager.getConnection(databaseURL,p);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Product prod = new Product();
                prod.setProduct_name(rs.getString("product_name"));
                prod.setBase_price(rs.getString("base_price"));
                prod.setSupplier_name(rs.getString("company_name"));
                prod.setQuantity(rs.getString("quantity"));
                productList.add(prod);
            }
        }
        catch (SQLException e) {
            System.out.printf("ERROR");
        }

    }

    public void displayProd() {
        for (Product p : productList) {
            System.out.println(p.getProduct_name()+" "+p.getBase_price()+" "+p.getSupplier_name());
        }
    }

    public void login(String username, String password) {
        String query = String.format("SELECT * FROM login\n" +
                "WHERE username = '" + username + "' and password = '" + password + "'");

        try {
            Connection conn = DriverManager.getConnection(databaseURL, p);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                System.out.println("Logged In!");
            }
        } catch (SQLException e) {
            System.out.printf("ERROR");
        }


    }

    public ArrayList<Product> getProductList () {
        return productList;
    }

}

