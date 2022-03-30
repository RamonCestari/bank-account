package entities;

public class Account {
    private static final int TAX = 5;
    private final int number;
    private String name;
    private String lastName;
    private double balance;
    private double initialDeposit;
    private double deposit;
    private double withdraw;

    public Account(int number) {
        this.number = number;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDeposit(double deposit) {
        this.balance += deposit;
    }

    public void setWithdraw(double withdraw) {
        this.balance -= withdraw + TAX;
    }


    public void setInitialDeposit(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + name + " " + lastName
                + ", Balance: $ "
                + String.format("%.2f", balance);

    }
}

