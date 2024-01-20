/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class BankAccountList {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    public BankAccountList() {

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of account information: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BankAccount c = new BankAccount();
            c.input();
            accounts.add(c);
        }
    }

    public void print() {
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).print();
        }
    }

    private static BankAccount findAccount(ArrayList<BankAccount> accounts, int accNum) {
        for (BankAccount account : accounts) {
            if (account.getAccNum() == accNum) {
                return account;
            }
        }
        return null;
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deposit money: ");
        double amount = sc.nextDouble();
        System.out.print("From the account: ");
        int accNum = sc.nextInt();
        BankAccount selectAcc = findAccount(accounts, accNum);
        selectAcc.deposit(amount);

    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Withdraw money: ");
        double amount = sc.nextDouble();
        System.out.print("From the account: ");
        int accNum = sc.nextInt();
        BankAccount selectAcc = findAccount(accounts, accNum);
        if (selectAcc.withdraw(amount)) {
            System.out.println("Withdraw successful.");

        } else {
            System.out.println("Withdraw unsuccessful.");
        }
        /*System.out.print("From the account number: ");
        int b = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNum() == b) {
                if (accounts.get(i).withdraw(amount)) {
                    System.out.print("Withdraw successful.");
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.print("Withdraw unsuccessful.");
        }
        System.out.println();*/
    }

    public void transferMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Transfer money: ");
        double amount = sc.nextDouble();
        System.out.print("From the account number: ");
        int fromAccNum = sc.nextInt();
        System.out.print("Into the account number: ");
        int toAccNum = sc.nextInt();
        BankAccount selectAcc = findAccount(accounts, fromAccNum);
        BankAccount toAcc = findAccount(accounts, toAccNum);
        if (selectAcc.transferMoney(toAcc, amount)) {
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer unsuccessful.");
        }
        /*BankAccount toAccNum=
        boolean flag = false;
        
        
        
        for (int i = 0; i <accounts.size(); i++) {
            if (accounts.get(i).mAccNum == c) {
                if (accountsget(i).) {
                    print();
                    //System.out.print("Yes");
                    flag = true;
                }

            }
        }
        if (!flag) {
            System.out.print("No");
        }*/

    }

}
