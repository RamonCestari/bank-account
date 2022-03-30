package entities;

public class Account {
    private static final double WITHDRAW_TAX = 5.0;
    private final int number;
    private String name;
    private double balance;

    //CONSTRUCTOR FOR ACCOUNTS WITHOUT INITIAL DEPOSIT.
    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    //CONSTRUCTOR FOR ACCOUNTS WITH INITIAL DEPOSIT.
    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        setDeposit(initialDeposit);
    }

    public double getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setDeposit(double deposit) {
        balance += deposit;
    }

    public void setWithdraw(double withdraw) {
        this.balance -= withdraw + WITHDRAW_TAX;
    }

    @Override
    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);

    }
}

