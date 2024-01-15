/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storemanage.storemanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Listproduct {

    ArrayList<Product> numberOfProduct = new ArrayList<Product>();

    public void InpuListproduct() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of products: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Product p = new Product();
            p.InputProduct();
            numberOfProduct.add(p);
        }
    }

    public void OutputListproduct() {
        for (int i = 0; i < numberOfProduct.size(); i++) {
            numberOfProduct.get(i).OutputProduct();
        }
    }

    public void ProductLessThan100() {
        for (int i = 0; i < numberOfProduct.size(); i++) {
            if (numberOfProduct.get(i).GetPrice() < 100) {
                numberOfProduct.get(i).OutputProduct();
            }
        }
    }

    public void SortProductByDate() {
        for (int i = 0; i < numberOfProduct.size(); i++) {
            for (int j = i + 1; j < numberOfProduct.size(); j++) {
                if (numberOfProduct.get(i).GetDate() > numberOfProduct.get(j).GetDate()) {
                    Product t = numberOfProduct.get(i);
                    numberOfProduct.set(i, numberOfProduct.get(j));
                    numberOfProduct.set(j, t);
                }
            }
        }
        OutputListproduct();
    }
}
