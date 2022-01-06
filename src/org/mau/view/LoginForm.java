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

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {

            String username = userField.getText();
            String password = userField.getText();
            controller.login(username,password);

        }

    }

    public void displayWindow() {
        setVisible(true);
    }
}
