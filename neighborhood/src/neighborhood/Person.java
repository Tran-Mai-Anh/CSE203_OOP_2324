package com.mycompany.neighborhood;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author maianhtran
 */
public class Person{

    //Thuoc tinh
    String firstName;
    String lastName;
    int age;
    String occupation;
    String identityCardNumber;

    //Phương thức 
    //1. Khởi tạo(trùng tên với tên lớp )   
    Person() {

    }

    Person(String firstName, String lastName, int age, String occupation, String identityCardNumber) {
        this.firstName = firstName;// this de goi bien trung ten
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.identityCardNumber = identityCardNumber;
    }

    //2. Các phương thức khác   
    void InputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("first name: ");
        firstName = sc.nextLine();
        System.out.print("last name: ");
        lastName = sc.nextLine();
        System.out.print("age: ");
        age = sc.nextInt();
    }

    void OutputPerson() {
        System.out.println("First name: " + firstName + " Last name: " + lastName + " Age: " + age);
    }

    int GetAge() {

        return age;
    }
}
