package exceptions;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class User {
    private String firstName;
    private String lastName;
    private Character gender;
    private String address;
    private String username;
    private String password;
    private MessageDigest digest;

    private static final int maxLoginAttempts = 3;
    private static int loginAttempts;

    private String hash(String strToHash) {
        try {
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(strToHash.getBytes(StandardCharsets.UTF_8));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }

    public User(String firstName, String lastName, Character gender, String address,
                String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) throws ExcessiveFailedLoginException {
        if (this.username.equals(username)) {
            if (loginAttempts == maxLoginAttempts) {
                loginAttempts++;
                throw new ExcessiveFailedLoginException();
            } else if (loginAttempts > maxLoginAttempts) {
                throw new ExcessiveFailedLoginException("Anda telah mencapai batas login");
            }

            if (this.password.equals(hash(password))) {
                loginAttempts = 0;
                return true;
            } else {
                loginAttempts++;
            }
        }
        return false;
    }

    public String greeting() {
        String greet = "Selamat Datang!";
        switch (gender) {
            case 'M' : greet += "Tuan "; break;
            case 'F' : greet += "Nona "; break;
        }
        greet += this.firstName + " " + this.lastName;

        return greet;
    }

    public String getUsername() {
        return username;
    }

}
