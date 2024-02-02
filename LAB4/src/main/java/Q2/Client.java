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
public class Client {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter bank's name: ");
        String bankName = sc.next();
        BankType type;
        if (bankName.equalsIgnoreCase("TPBank")) {
            type = BankType.TPBank;
        } else if (bankName.equalsIgnoreCase("VietcomBank")) {
            type = BankType.VietcomBank;
        } else {
            System.out.println("Wrong input.");
            return;
        }

        Bank bank = BankFactory.getBankName(type);

        System.out.println(bank.getBankName());
    }
}
