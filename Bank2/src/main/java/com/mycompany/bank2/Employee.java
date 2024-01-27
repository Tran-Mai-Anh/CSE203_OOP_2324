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
public abstract class Employee extends Person implements ITax, IInsurance {

    private double salary;

    public Employee() {
    }

    public Employee(double salary, String firstName, String lastName, int age, String occupation, String identityCardNumber) {
        super(firstName, lastName, age, occupation, identityCardNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void getSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void InputPerson() {
        super.InputPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary: ");
        salary = sc.nextDouble();
    }

    @Override
    public void OutputPerson() {
        super.OutputPerson();
        System.out.print(" - Salary: " + salary);
    }

    public abstract double calculateSalary();

    @Override
    public void PersonalIncomeTax() {

    }

    @Override
    public void OutputPersonalIncomeTax() {
        System.out.print("Dependant: ");
        System.out.print(numbersDependant);
        System.out.print(CalculateSalary() * 0.05);
    }
    
    @Override
    public void CaculInsurance(){
        
    }

}
