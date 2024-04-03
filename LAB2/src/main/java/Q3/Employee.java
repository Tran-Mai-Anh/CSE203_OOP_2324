/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Employee {

    String code;
    String fullName;
    int numberOfYearOfService;
    double salaryCoefficient;
    double basicSalary;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberOfYearOfService() {
        return numberOfYearOfService;
    }

    public void setNumberOfYearOfService(int numberOfYearOfService) {
        this.numberOfYearOfService = numberOfYearOfService;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Employee() {

    }

    public Employee(String code, String fullName, int numberOfYearOfService, double salaryCoefficient, double basicSalary) {
        this.code = code;
        this.fullName = fullName;
        this.numberOfYearOfService = numberOfYearOfService;
        this.salaryCoefficient = salaryCoefficient;
        this.basicSalary = basicSalary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee code: ");
        code = sc.nextLine();
        System.out.print("Employee's full name: ");
        fullName = sc.nextLine();
        System.out.print("Number of years of service: ");
        numberOfYearOfService = sc.nextInt();
        System.out.print("Salary coefficient: ");
        salaryCoefficient = sc.nextDouble();
        System.out.print("Basic salary: ");
        basicSalary = sc.nextDouble();
    }

    public void print() {
        System.out.println("Employee code: " + code + " Employee's full name: " + fullName + " Number of years of service: " + numberOfYearOfService + " Salary coefficient: " + salaryCoefficient + " Basic salary: " + basicSalary);
    }

    public double salary() {
        double salary = salaryCoefficient * basicSalary;
        return salary;
    }

}
