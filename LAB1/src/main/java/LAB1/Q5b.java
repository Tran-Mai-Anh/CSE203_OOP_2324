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

public class Q5b {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(reader.nextInt());
        }
        removeRandom(a, n);
    }

    public static void removeRandom(ArrayList a, int n) {
        System.out.print("Insert ");
        int insert = reader.nextInt();
        System.out.print("Position ");
        int position = reader.nextInt();
        a.add(position, insert);
        a.remove(a.size() - 1);
        System.out.println(a);

    }
}
