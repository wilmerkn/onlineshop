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
    private JPanel manageLabel;
    private LoginForm loginForm;

    DefaultListModel<Product> model;

    public MainFrame(Controller controller) {

        super("Title");
        this.controller = controller;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.loginForm = new LoginForm(controller);
        init();
        setSize(500,500);
        this.setLocationRelativeTo(null);




    }

    public void init() {;
        this.viewCartButton.setVisible(false);
        this.confirmOrderButton.setVisible(false);
        this.manageLabel.setVisible(false);
        this.addButton.setVisible(false);
        this.removeButton.setVisible(false);
        this.suppliersButton.setVisible(false);
        this.productsButton.setVisible(false);
        this.ordersButton.setVisible(false);
        this.discountsButton.setVisible(false);

        this.loginButton.addActionListener(this);
        this.registerButton.addActionListener(this);
        this.viewCartButton.addActionListener(this);
        this.confirmOrderButton.addActionListener(this);
        this.addButton.addActionListener(this);
        this.removeButton.addActionListener(this);
        this.productsButton.addActionListener(this);
        this.suppliersButton.addActionListener(this);
        this.discountsButton.addActionListener(this);
        this.ordersButton.addActionListener(this);
        this.sökButton.addActionListener(this);

    }



    public void login() {

        manageLabel.setVisible(true);
        confirmOrderButton.setVisible(true);
        viewCartButton.setVisible(true);
        addButton.setVisible(true);
        removeButton.setVisible(true);
        suppliersButton.setVisible(true);
        productsButton.setVisible(true);
        productsButton.setVisible(true);
        ordersButton.setVisible(true);
        discountsButton.setVisible(true);


    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.loginButton) {
            loginForm.displayWindow();
            //controller.login();
            //login();
        }

        if (e.getSource() == this.registerButton) {
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
