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
public class Teller extends Employee {

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
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getPayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
