/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package LAB1;

/**
 *
 * @author maianhtran
 */
import java.util.*;

public class Q1 {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int n = reader.nextInt();
        String nStr = String.valueOf(n);
        char firstDigit = nStr.charAt(0);
        char lastDigit = nStr.charAt(nStr.length() - 1);

        int sum = Character.getNumericValue(firstDigit) + Character.getNumericValue(lastDigit);
        System.out.println(sum);
    }

}
