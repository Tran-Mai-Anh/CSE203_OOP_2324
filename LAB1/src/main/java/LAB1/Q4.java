/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

/**
 *
 * @author maianhtran
 */
import java.util.*;

public class Q4 {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = input();
        sumEvenEle(a);
    }

    public static void sumEvenEle(int[] a) {
        int sum = 0;
        for (int e : a) {
            if (e % 2 == 0) {
                sum += e;
            }
        }
        System.out.println(sum);
    }

    public static int[] input() {
        int n = reader.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = reader.nextInt();
        }
        return a;
    }
}
