/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageneighborhood.manage;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Person {

    String fullname;
    int age;
    String occupation;
    String id;

    public Person() {

    }

    public Person(String fullname, int age, String occupation, String id) {
        this.fullname = fullname;
        this.age = age;
        this.occupation = occupation;
        this.id = id;
    }

    public void InputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Full name: ");
        fullname = sc.nextLine();
        System.out.println("Age: ");
        age = sc.nextInt();
        System.out.println("Occupation: ");
        occupation = sc.nextLine();
        System.out.println("Identity card number: ");
        id = sc.nextLine();
    }

    public void OutputPerson() {
        System.out.println("Full name: " + fullname + " Age: " + age + " Occupation: " + occupation + " Identity card number: " + id);
    }

}
