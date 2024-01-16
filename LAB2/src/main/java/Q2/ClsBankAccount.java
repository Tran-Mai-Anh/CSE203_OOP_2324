/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class ClsBankAccount {

    public static void main(String[] args) {
        BankAccountList bankAccount = new BankAccountList();
        bankAccount.input();
        bankAccount.print();
        Scanner sc = new Scanner(System.in);
        double amount;
        System.out.print("Deposit money: ");
        amount = sc.nextDouble();
        int a;
        System.out.print("Into the account number: ");
        a = sc.nextInt();
        bankAccount.deposit(a, amount);
        bankAccount.print();
        System.out.print("Withdraw money: ");
        amount = sc.nextDouble();
        int b;
        System.out.print("From the account number: ");
        b = sc.nextInt();
        bankAccount.withdraw(b, amount);
        System.out.println();
        System.out.print("Transfer money: ");
        amount = sc.nextDouble();
        int c;
        int d;
        System.out.print("From the account number: ");
        c = sc.nextInt();
        System.out.print("Into the account number: ");
        d = sc.nextInt();
        bankAccount.transferMoney(c, amount);

    }

}
