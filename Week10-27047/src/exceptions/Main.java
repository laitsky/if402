package exceptions;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<User> users = new ArrayList<User>();

    public static void mainMenu() {
        System.out.println("1. Login");
        System.out.println("2. Sign Up");
        System.out.print("Pilihan : ");
    }

    public static void initialize() {
        users.add(new User("John","Doe",'L',"Jl. Merpati No. 1 RT 1 RW 1, Banten","admin","admin"));
    }

    public static void handlelogin (String userName, String password) throws AuthenticationException {
        boolean check = false;
        for (int i = 0; i < users.size(); i++) {
            try {
                if (users.get(i).login(userName, password)) {
                    System.out.println(users.get(i).greeting());
                }
                if (users.get(i).getUserName().equals(userName)) {
                    check = true;
                }
            } catch (ExcessiveFailedLoginException e) {
                System.out.println(e.getMessage());
                check = true;
            }
        }
        if (!check) {
            throw new AuthenticationException("User tidak terdaftar!");
        }
    }

    public static void handleSignUp(String userName, String password) throws InvalidPropertyException{
        boolean checkcase = false, checkdigit = false;
        if (userName.length() <= 8) {
            throw new InvalidPropertyException("Username harus memiliki lebih dari 8 karakter!");
        }
        if (password.length() == 0) {
            return;
        }
        if (password.length() >= 6 && password.length() <= 16) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    checkcase = true;
                }
                if (Character.isDigit(password.charAt(i))) {
                    checkdigit = true;
                }
            }
            if (!checkcase || !checkdigit) {
                throw new InvalidPropertyException("Password harus mengandung huruf besar dan angka!");
            }
        } else {
            throw new InvalidPropertyException("Password harus mengandung huruf besar, angka, minimum 6 karakter, dan maksimum 16 karakter!");
        }
    }

    public static void main(String[] args) {
        String firstName = null, lastName = null, address = null, userName = null, password = null;
        Character gender = null;
        int option;
        Scanner sc = new Scanner(System.in);
        initialize();
        for (; ; ) {
            mainMenu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Username : ");
                    userName = sc.next();
                    System.out.print("Password : ");
                    password = sc.next();
                    try {
                        handlelogin(userName, password);
                    } catch (AuthenticationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    boolean pass = true;
                    while (pass) {
                        System.out.print("First Name   : ");
                        firstName = sc.next();
                        System.out.print("Last Name    : ");
                        lastName = sc.next();
                        System.out.print("Gender (L/P) : ");
                        gender = sc.next().charAt(0);
                        System.out.print("Alamat       : ");
                        address = sc.next();
                        System.out.print("Username     : ");
                        userName = sc.next();
                        try {
                            handleSignUp(userName, "");
                            pass = false;
                        } catch (InvalidPropertyException e) {
                            System.out.println(e.getMessage());
                            pass = true;
                        }
                        if (!pass) {
                            System.out.print("Password     : ");
                            password = sc.next();
                            try {
                                handleSignUp(userName, password);
                                pass = false;
                            } catch (InvalidPropertyException e) {
                                System.out.println(e.getMessage());
                                pass = true;
                            }
                        }
                    }
                    users.add(new User(firstName, lastName, gender, address, userName, password));
                    System.out.println("User telah berhasil didaftarkan!");
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
