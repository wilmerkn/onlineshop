package org.mau.controller;
import org.mau.view.*;
import org.mau.model.*;
import java.util.ArrayList;

public class Controller {
    MainFrame frame;
    DatabaseConnection c;

    public Controller() {
        this.frame = new MainFrame(this);
        frame.setVisible(true);
        c = new DatabaseConnection();
        c.query();
        //c.displayProd();
        //frame.viewProduct(c.getProductList());


    }


    public void login(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        c.login(username,password);
        System.out.println("Controller login");



        //IF OK CALL LOGIN
        //frame.login();

    }
    public void register() {
        System.out.println("register");
    }

    public void viewCart() {
        System.out.println("viewCart");
    }

    public void confirmOder() {
        System.out.println("confirmOder");
    }

    public void add() {
        System.out.println("add");
    }

    public void remove() {
        System.out.println("remove");
    }

    public void search() {
        System.out.println("sök");
    }

    public void suppiers() {
        System.out.println("suppiers");
    }

    public void products() {
        System.out.println("products");
    }

    public void orders() {
        System.out.println("orders");
    }

    public void discounts() {
        System.out.println("discounts");
    }

}
