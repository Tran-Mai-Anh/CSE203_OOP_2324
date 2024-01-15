/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storemanage.storemanage;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Product {

    String code;
    String name;
    int price;
    int date;

    Product() {

    }

    Product(String code, String name, int price, int date) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.date = date;

    }

    public void InputProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Product code: ");
        code = sc.nextLine();
        System.out.print("Product name: ");
        name = sc.nextLine();
        System.out.print("Product price: ");
        price = sc.nextInt();
        System.out.print("Date of manufacture: ");
        date = sc.nextInt();

    }

    public void OutputProduct() {
        System.out.println("Product code: " + code + " Product name: " + name + " Product price: " + price + " Date of manufacture: " + date);

    }

    public int GetPrice() {
        return price;
    }

    public int GetDate() {
        return date;
    }

}
