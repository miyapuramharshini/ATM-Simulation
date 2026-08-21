package ATMSimulation;

import java.util.Scanner;

public class AtmMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User[] users = new User[3];

        users[0] = new User(9876, "Harshini", 1234, 10000);
        users[1] = new User(8765, "Honey", 2345, 5000);
        users[2] = new User(7654, "Varsha", 3456, 6000);

        // Login
        System.out.println("Enter the Account Number:");
        int accountNo = sc.nextInt();

        System.out.println("Enter the PIN Code:");
        int pin = sc.nextInt();

        User loggedInUser = null;

        // Check account number and PIN
        for (User user : users) {

            if (accountNo == user.getAccountno()
                    && pin == user.getPin()) {

                loggedInUser = user;
                break;
            }
        }

        // Login failed
        if (loggedInUser == null) {
            System.out.println("Invalid Account Number or PIN!!");
            sc.close();
            return;
        }

        // Login successful
        System.out.println("\nWelcome "
                + loggedInUser.getAccholdername()
                + "!");
        System.out.println("Welcome to SBI Services!");

        AtmImpl atm = new AtmImpl(loggedInUser);

        boolean status = true;

        while (status) {

            System.out.println("\n------ ATM MENU ------");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Set Password");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> atm.checkbalance();

                case 2 -> atm.withdraw();

                case 3 -> atm.deposit();

                case 4 -> atm.setpassword();

                case 5 -> {
                    status = false;
                    System.out.println(
                            "Thank you for choosing our services!!");
                    System.out.println("Have a nice day!!");
                }

                default -> System.out.println("Invalid choice!!");
            }
        }

        sc.close();
    }
}