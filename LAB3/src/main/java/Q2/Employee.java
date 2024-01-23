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

public abstract class Employee {

    String employeeID;
    private String employeeName;
    private int yearOfBirth;
    private String address;
    private String phone;

    public Employee() {

    }

    public Employee(String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Employee ID: ");
        employeeID=sc.nextLine();
        System.out.print("Employee name: ");
        employeeName=sc.nextLine();
        System.out.print("Year of birth: ");
        yearOfBirth=sc.nextInt();
        System.out.print("Address: ");
        address=sc.nextLine();
        System.out.print("Phone: ");
        phone=sc.nextLine();
    }
    
    public void output(){
        System.out.println("Employee ID: "+employeeID+" Employee name: "+employeeName+" Year of birth: "+yearOfBirth+" Address: "+address+" Phone: "+phone);
    }
    
    public abstract String getInfo();
    
    public abstract float getPayment();

}
