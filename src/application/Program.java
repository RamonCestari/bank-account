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
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit? (y/n) ");
        char answer = sc.next().charAt(0);
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, name, initialDeposit);
        } else {
            account = new Account(number, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        account.setDeposit(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account.setWithdraw(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
