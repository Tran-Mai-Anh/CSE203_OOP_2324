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

    public Dictionary() {
    }

    static Scanner sc = new Scanner(System.in);

    HashMap<String, String> dic = new HashMap<>();

    public static void main(String[] args) {
        Dictionary dic = new Dictionary();
        dic.input();
        System.out.print("Enter words: ");
        String word = sc.next();
        if (dic.Check(word)) {
            System.out.println("Word exists.");
        } else {
            System.out.println("Word not exist.");
        }
        dic.findMeaning(word);
    }

    public void input() {
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
    }

    public boolean Check(String word) {
        if (dic.containsKey(word)) {
            return true;
        }
        return false;
    }

    public void findMeaning(String word) {
        if (Check(word)) {
            System.out.println("Meaning: " + dic.get(word));
        }
    }
}
