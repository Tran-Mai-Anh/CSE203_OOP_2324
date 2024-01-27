/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank2;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Teller extends Employee implements ITax {

    public Teller() {

    }

    public Teller(String stationNumber, float hoursWorked, double salary, String firstName, String lastName, int age, String occupation, String identityCardNumber) {
        super(salary, firstName, lastName, age, occupation, identityCardNumber);
        this.stationNumber = stationNumber;
        this.hoursWorked = hoursWorked;
    }

    private String stationNumber;

    public String getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(String stationNumber) {
        this.stationNumber = stationNumber;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    private float hoursWorked;

    @Override
    public void InputPerson() {
        Scanner sc = new Scanner(System.in);
        super.InputPerson();
        System.out.print("Station number: ");
        stationNumber = sc.nextLine();
        System.out.print("Hours worked: ");
        hoursWorked = sc.nextFloat();

    }

    @Override
    public void OutputPerson() {
        super.OutputPerson();
        System.out.print("Station number: " + stationNumber + " Hours worked: " + hoursWorked);

    }

    @Override
    public double calculateSalary() {
        return getSalary() * 1800000;
    }

    @Override
    public void PersonalIncomeTax() {
    }

    @Override
    public void OutputPersonalIncomeTax() {
    }

    @Override
    public void InputDependant() {
        System.out.print("Input Dependant (officer): ");
        
    }
    
   

}
