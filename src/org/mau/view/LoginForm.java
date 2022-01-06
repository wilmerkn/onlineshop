package org.mau.view;

import org.mau.controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    private JPasswordField passwordField;
    private JTextField userField;
    private JButton loginButton;
    private JPanel mainPanel;
    private Controller controller;


    public LoginForm(Controller controller) {
        super("Login Window");
        this.controller = controller;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        loginButton.addActionListener(this);
        setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {

            String username = userField.getText();
            String password = String.valueOf(passwordField.getPassword());
            System.out.println("loginform login");
            controller.login(username,password);
            hideWindow();


        }

    }

    public void displayWindow() {
        this.setVisible(true);
    }
    public void hideWindow(){this.setVisible(false);}
}
