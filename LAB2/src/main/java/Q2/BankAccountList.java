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

    ArrayList<BankAccount> CustomerList = new ArrayList<BankAccount>();

    public BankAccountList() {

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of account information: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BankAccount c = new BankAccount();
            c.input();
            CustomerList.add(c);
        }
    }

    public void print() {
        for (int i = 0; i < CustomerList.size(); i++) {
            CustomerList.get(i).print();
        }
    }

    public void deposit(int b, double amount) {
        for (int i = 0; i < CustomerList.size(); i++) {
            if (CustomerList.get(i).mAccNum == b) {
                CustomerList.get(i).deposit(amount);
            }
        }
    }

    public void withdraw(int b, double amount) {
        boolean flag = false;
        for (int i = 0; i < CustomerList.size(); i++) {
            if (CustomerList.get(i).mAccNum == b) {
                if (CustomerList.get(i).mBalance > amount) {
                    System.out.print("Yes");
                    flag = true;
                }

            }
        }
        if (!flag) {
            System.out.print("No");
        }
    }

    public void transferMoney(int b, double amount) {
        boolean flag = false;
        for (int i = 0; i < CustomerList.size(); i++) {
            if (CustomerList.get(i).mAccNum == b) {
                if (CustomerList.get(i).mBalance > amount) {
                    System.out.print("Yes");
                    flag = true;
                }

            }
        }
        if (!flag) {
            System.out.print("No");
        }

    }

}
