package org.mau.view;

import javax.swing.*;

    class RegisterFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel mainPanel;
    private JTextField textField6;
    private JButton createAccountButton;

    public RegisterFrame() {
        super("Create Account");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setLocationRelativeTo(null);
        this.pack();

    }
}
