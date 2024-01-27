/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class FullTimeEmployee extends Employee {

    private float salary;

    public FullTimeEmployee(float salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(float salary, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public FullTimeEmployee() {

    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary: ");
        salary = sc.nextFloat();

    }

    @Override
    public float getPayment() {
        return getSalary();
    }

    @Override
    public String getInfo() {
        return " - Employee ID: " + employeeID
                + " - Employee name: " + employeeName
                + " - Year of birth: " + yearOfBirth
                + " - Address: " + address
                + " - Phone: " + phone
                + " - Salary: " + salary;

    }

}
