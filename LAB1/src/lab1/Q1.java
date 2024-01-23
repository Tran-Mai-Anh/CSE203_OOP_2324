/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lab1;

/**
 *
 * @author maianhtran
 */
import java.util.*;

public class Q1 {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int n = reader.nextInt();
        int a = n % 10;
        while (n > 10) {
            n /= 10;
        }
        int sum = a + n;
        System.out.print(sum);
    }

}
