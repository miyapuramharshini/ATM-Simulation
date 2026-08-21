package ATMSimulation;

public class User {

    private int accountno;
    private String accholdername;
    private int pin;
    private double balance;

    public User(int accountno, String accholdername, int pin, double balance) {
        this.accountno = accountno;
        this.accholdername = accholdername;
        this.pin = pin;
        this.balance = balance;
    }

    public User() {
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getAccholdername() {
        return accholdername;
    }

    public void setAccholdername(String accholdername) {
        this.accholdername = accholdername;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}