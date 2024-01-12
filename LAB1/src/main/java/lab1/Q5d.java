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

public class Q5d {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(reader.nextInt());
        }
        removeDuplicate(a);
    }

    public static void removeDuplicate(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) == a.get(j)) {
                    a.remove(j);
                }
            }
        }
        System.out.println(a);
    }

}
