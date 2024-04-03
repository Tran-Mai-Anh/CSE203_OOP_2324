/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class EmployeeList {

    ArrayList<Employee> list = new ArrayList<Employee>();

    public EmployeeList() {

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of employees: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee e = new Employee();
            e.input();
            list.add(e);
        }
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).print();
        }
    }

    public void calculateSalary() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).print();
            System.out.println("Salary: " + list.get(i).salary());
        }
    }

    public void highestSalary() {
        System.out.println("The employees with the highest salary: ");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).salary() < list.get(j).salary()) {
                    Employee t = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, t);
                }
            }
        }
        list.get(0).print();
    }

    public void Sort() {
        System.out.println("Arrange employees's salaries to decrease gradually: ");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).salary() < list.get(j).salary()) {
                    Employee t = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, t);
                }
            }
        }
        calculateSalary();
    }

}
