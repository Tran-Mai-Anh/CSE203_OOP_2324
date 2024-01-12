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

public class Q6d {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        String n = reader.nextLine();
        if (isPalindrome(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String n) {
        int left = 0;
        int right = n.length() - 1;
        while (left < right) {
            if (n.charAt(left) != n.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
