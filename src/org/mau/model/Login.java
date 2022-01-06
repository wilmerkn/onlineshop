package org.mau.model;


public class Login {
    private String username;
    private String email;
    private boolean isAdmin;

    public Login(String username){//, String email, boolean isAdmin) {
        this.username = username;
        this.email = email;
        this.isAdmin = isAdmin;
        //behöver hämta email och is_admin från databas, just nu bara test

    }

    public String getUsername() {
        return username;
    }


    public String getEmail() {return email;}

    public boolean isAdmin() {
        return isAdmin;
    }
}
