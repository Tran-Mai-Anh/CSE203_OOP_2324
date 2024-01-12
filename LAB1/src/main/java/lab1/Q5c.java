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

public class Q5c {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int n = reader.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = reader.nextInt();
        }
        findDuplicate(a);
    }

    public static void findDuplicate(int[] a) {
        boolean isPresent = false;
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    if (b.contains(a[i])) {
                        break;
                    } else {
                        b.add(a[i]);
                        isPresent = true;
                    }
                }
            }
        }
        if (isPresent) {
            System.out.println(b);
        } else {
            System.out.println("No duplicates elements in array");
        }
    }

}
