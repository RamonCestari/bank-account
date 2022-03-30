package application;


import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Account account;
        System.out.print("Enter account number: ");
        account = new Account(sc.nextInt());

        System.out.print("Enter account holder: ");
        account.setName(sc.next());
        account.setLastName(sc.next());

        System.out.print("Is there an initial deposit? (y/n) ");
        String initialDeposit = sc.next();
        if (initialDeposit.equals("Y") || initialDeposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            account.setInitialDeposit(sc.nextDouble());
        }
        System.out.println();
        System.out.println("Account data:");
        //Using Getters
        System.out.printf("Account %.0f, Holder: %s %s, Balance: $ %.2f%n", account.getNumber(), account.getName(), account.getLastName(), account.getBalance());

        System.out.println();
        System.out.print("Enter a deposit value: ");
        account.setDeposit(sc.nextDouble());
        System.out.println("Updated account data:");
        //Printing from Method.
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account.setWithdraw(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account);


    }
}
