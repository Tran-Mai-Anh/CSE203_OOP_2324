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

public class Q5a {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(reader.nextInt());
        }
        removeFirstEle(a, n);
    }

    public static void removeFirstEle(ArrayList a, int n) {
        if (n == 0) {
            System.out.println("False");
        } else {
            a.remove(0);
            System.out.println(a);
            System.out.println("True");
        }
    }
}
