package ATMSimulation;

import java.util.Scanner;

public class AtmImpl implements Atminterface {

    Scanner sc = new Scanner(System.in);

    User u1;

    public AtmImpl(User u) {
        u1 = u;
    }

    @Override
    public void checkbalance() {

        System.out.println("Current Balance: ₹" + u1.getBalance());
    }

    @Override
    public void withdraw() {

        System.out.println("Enter the amount to withdraw:");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
        } 
        else if (amount > u1.getBalance()) {
            System.out.println("Insufficient Funds!!");
        } 
        else {
            double balance = u1.getBalance() - amount;
            u1.setBalance(balance);

            System.out.println("Amount Withdrawn Successfully!!");
            System.out.println("Remaining Balance: ₹" + u1.getBalance());
        }
    }

    @Override
    public void deposit() {

        System.out.println("Enter amount to deposit:");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
        } 
        else {
            double balance = u1.getBalance() + amount;
            u1.setBalance(balance);

            System.out.println("Deposited Successfully!!");
            System.out.println("Current Balance: ₹" + u1.getBalance());
        }
    }

    @Override
    public void setpassword() {

        System.out.println("Enter the old PIN:");
        int oldPin = sc.nextInt();

        if (oldPin == u1.getPin()) {

            System.out.println("Enter new PIN:");
            int newPin = sc.nextInt();

            if (newPin >= 1000 && newPin <= 9999) {
                u1.setPin(newPin);
                System.out.println("PIN changed successfully!!");
            } 
            else {
                System.out.println("PIN must contain 4 digits.");
            }

        } 
        else {
            System.out.println("Invalid PIN!!");
        }
    }
}