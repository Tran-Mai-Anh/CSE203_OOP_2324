/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author maianhtran
 */
public class ManageEmployeeSalary {
    public static void main(String [] args){
        EmployeeList employeeList=new EmployeeList();
        employeeList.input();
        employeeList.calculateSalary();
        employeeList.highestSalary();
        employeeList.Sort();
    }
}
