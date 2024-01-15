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
        System.out.print("Amount: ");
        amount = sc.nextDouble();
        int b;
        System.out.print("Into the account number: ");
        b = sc.nextInt();
        //bankAccount.deposit(b, amount);
        //bankAccount.print();
        //bankAccount.withdraw(b, amount);
        bankAccount.transferMoney(b, amount);
    }

}
