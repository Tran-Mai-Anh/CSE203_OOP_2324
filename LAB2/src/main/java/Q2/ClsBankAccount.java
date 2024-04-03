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
        bankAccount.deposit();
        bankAccount.withdraw();
        bankAccount.transferMoney();
    }

}
