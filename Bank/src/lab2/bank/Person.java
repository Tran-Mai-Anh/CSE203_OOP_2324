/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bank;

/**
 *
 * @author maianhtran
 */
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author maianhtran
 */
public class Person {

    //Thuoc tinh
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
    private String identityCardNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

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
    public void InputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        firstName = sc.nextLine();
        System.out.print("Last name: ");
        lastName = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Occupation: ");
        occupation = sc.nextLine();
        System.out.print("Identity card number: ");
        identityCardNumber = sc.nextLine();
    }

    public void OutputPerson() {
        System.out.println("First name: " + firstName + " Last name: " + lastName + " Age: " + age + " Occupation: " + occupation + " Identity card number: " + identityCardNumber);
    }

}
