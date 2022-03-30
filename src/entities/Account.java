package entities;

public class Account {
    private static final double WITHDRAW_TAX = 5.0;
    private final int number;
    private String name;
    private double balance;

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        setDeposit(initialDeposit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
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


    public void setInitialDeposit(double initialDeposit) {
        this.balance = initialDeposit;
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

