package org.mau.view;

import org.mau.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JFrame implements ActionListener {
    private JTextField userField;
    private JTextField passwordField;
    private JTextField emailField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JPanel mainPanel;
    private JTextField addressField;
    private JButton createAccountButton;
    private Controller controller;

    public RegisterForm(Controller controller) {
        super("Create Account");
        this.setPreferredSize(new Dimension(250,250));
        this.setResizable(false);
        this.controller = controller;
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setLocationRelativeTo(null);
        this.createAccountButton.addActionListener(this);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createAccountButton) {


            String username = userField.getText();
            String password = passwordField.getText();
            String email = emailField.getText();
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String address = addressField.getText();

            //boolean isRegistered = controller.register(username,password,email,firstName,lastName,address);

            if (true) {
                //OM account är unik med usernamne och email.

            } else  {
                //EJ unikt visa felmeddelande.
            }
        }
    }
    public void displayWindow() {
        this.setVisible(true);
    }
    public void hideWindow(){this.setVisible(false);}
}
