package GUI;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame{
    private JPanel mainPanel;
    private JTextField onlineStore;
    private JLabel OnlineStoreLabel;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JLabel passwordLabel;

    public LoginPage(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        addListener(loginButton);
    }


    private void addListener(JButton button) {
        button.addActionListener(e -> {

            //här ska man skickas vidare till nästa "ruta" efter att ha loggats in, alternativt få felmeddelande
            System.out.println("Login button clicked!");
        });
    }


}
