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
public class Q6b {
    static Scanner reader=new Scanner(System.in);
    public static void main(String[] args){
        String n=reader.nextLine();
        countWords(n);
    }
    public static void countWords(String n){
        int words=1;
        char[] a=n.toCharArray();
        for(char i:a)
            if(i==' ')
                words+=1;
        System.out.println("The number of words in string: "+words);
    }
    
}
