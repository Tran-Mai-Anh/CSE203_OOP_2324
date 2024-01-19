/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bank;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Customer extends Person {

    public Customer(int creditRating) {
        this.creditRating = creditRating;
    }

    public Customer(int creditRating, String firstName, String lastName, int age, String occupation, String identityCardNumber) {
        super(firstName, lastName, age, occupation, identityCardNumber);
        this.creditRating = creditRating;
    }
    private int creditRating;

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }

    @Override
    public void InputPerson() {
        super.InputPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Credit rating: ");
        creditRating = sc.nextInt();
    }

    @Override
    public void OutputPerson() {
        super.OutputPerson();
        System.out.print("Credit rating: " + creditRating);

    }

}
