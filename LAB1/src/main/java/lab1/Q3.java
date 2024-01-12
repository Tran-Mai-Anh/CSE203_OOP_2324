/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author maianhtran
 */
import java.util.*;

public class Q3 {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int n = reader.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                int a = n / 2;
                System.out.println(n + " is even, so we take n/2: " + a);
                n = a;
            } else {
                int b = 3 * n + 1;
                System.out.println(n + " is odd, so we take 3*n+1: " + b);
                n = b;
            }
        }
    }

}
