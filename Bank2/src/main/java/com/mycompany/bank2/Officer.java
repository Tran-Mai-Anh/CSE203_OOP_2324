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


public class Officer extends Employee implements ITax{

    public Officer() {
        this.numberOffice = numberOffice;
    }

    public Officer( double salary, String firstName, String lastName, int age, String occupation, String identityCardNumber) {
        super(salary, firstName, lastName, age, occupation, identityCardNumber);
        this.numberOffice = numberOffice;
    }

     
    private String numberOffice;

    public String getNumberOffice() {
        return numberOffice;
    }

    public void setNumberOffice(String numberOffice) {
        this.numberOffice = numberOffice;
    }
    @Override
    public void InputPerson(){
        super.InputPerson();
        System.out.print("Number office: ");
        Scanner sc=new Scanner(System.in);
        numberOffice=sc.nextLine();
        
    }
    @Override
    public void OutputPerson(){
        super.OutputPerson();
        System.out.print("Number office: "+numberOffice);
    }

    @Override
    public double calculateSalary() {
        return getSalary() * 1800000;
    }

    @Override
    public void InputDependant() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void PersonalIncomeTax() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void OutputPersonalIncomeTax() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
