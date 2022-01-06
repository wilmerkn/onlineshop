package org.mau.view;
import org.mau.controller.Controller;
import org.mau.model.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ActionListener{
    private Controller controller;
    private RegisterFrame register;
    private JButton loginButton;
    private JPanel mainPanel;
    private JTable table1;
    private JButton createAccountButton;
    private JList productList;
    private JButton registerButton;
    private JTextField textField1;
    private JButton sökButton;
    private JButton confirmOrderButton;
    private JButton viewCartButton;
    private JButton suppliersButton;
    private JButton productsButton;
    private JButton addButton;
    private JButton removeButton;
    private JButton ordersButton;
    private JButton discountsButton;
    DefaultListModel<Product> model;

    public MainFrame(Controller controller) {

        super("Title");
        this.controller = controller;
        this.model = new DefaultListModel<Product>();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setLocationRelativeTo(null);
        this.register = new RegisterFrame();

        this.loginButton = new JButton();
        this.loginButton.addActionListener(this);
        this.pack();
        init();


    }

    public void init() {;



    }

    public void test() {
        loginButton.setVisible(false);
    }





    public void viewProduct(ArrayList<Product> prod) {

        for (Product p : prod) {
            model.addElement(p);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.loginButton) {
            System.out.println("TEST");
            controller.login();
        }

        if (e.getSource() == registerButton) {
            controller.register();
        }

        if (e.getSource() == viewCartButton) {
            controller.viewCart();
        }

        if (e.getSource() == confirmOrderButton) {
            controller.confirmOder();
        }

        if (e.getSource() == addButton) {
            controller.add();
        }

        if (e.getSource() == removeButton) {
            controller.remove();
        }

        if (e.getSource() == suppliersButton) {
            controller.suppiers();
        }

        if (e.getSource() == productsButton) {
            controller.products();
        }

        if (e.getSource() == ordersButton) {
            controller.orders();
        }

        if (e.getSource() == discountsButton) {
            controller.discounts();

        }

        if (e.getSource() == sökButton) {
            controller.search();
        }

    }
}
