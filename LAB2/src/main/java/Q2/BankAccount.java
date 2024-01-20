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
public class BankAccount {

    private int mAccNum;
    private String mName;
    private double mBalance;

    public BankAccount() {

    }

    public BankAccount(int mAccNum, String mName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    }

    public int getAccNum() {
        return mAccNum;
    }

    public String getName() {
        return mName;
    }

    public double getBalance() {
        return mBalance;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account number: ");
        mAccNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Full name: ");
        mName = sc.nextLine();
        System.out.print("Account balance: ");
        mBalance = sc.nextDouble();
    }

    public void print() {
        System.out.println("Account number: " + mAccNum + " Full name: " + mName + " Account balance: " + mBalance);
    }

    public String toString() {
        return "Account number: " + mAccNum + " Full name: " + mName + " Account balance: " + mBalance;
    }

    public void deposit(double amount) {
        mBalance += amount;
        print();
    }

    public boolean withdraw(double amount) {
        if (amount <= mBalance) {
            mBalance-=amount;
            print();
            return true;
        }
        return false;
    }

    public boolean transferMoney(BankAccount b, double amount) {
        if (amount <= mBalance) {
            mBalance -= amount;
            b.deposit(amount);
            print();
            return true;
        }
        return false;
    }

}
