/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Dictionary {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        findWords();
    }

    public static void findWords() {
        HashMap<String, String> dic = new HashMap<>();
        dic.put("apple", "quả táo");
        dic.put("banana", "quả chuối");
        dic.put("orange", "quả cam");
        dic.put("coconut", "quả dừa");
        dic.put("kiwi", "quả kiwi");
        dic.put("cherry", "quả cherry");
        dic.put("mango", "quả xoài");
        dic.put("fig", "quả sung");
        dic.put("watermelon", "quả dưa hấu");
        dic.put("pear", "quả lê");
        System.out.print("Enter words: ");
        String word = sc.next();
        if (dic.containsKey(word)) {
            System.out.println("Word exists.");
            System.out.println("Meaning: " + dic.get(word));
        } else {
            System.out.println("Word does not exist.");
        }
    }

}
