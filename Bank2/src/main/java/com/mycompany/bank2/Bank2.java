/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Bank2 {


    private ArrayList<Employee> arrs = new ArrayList<>();

    public Bank2() {

    }

    public void input() {
        ITax employ=new Employee

        System.out.print("N: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee employee;
            System.out.print("1: Officer; 2: Teller");
            int k = sc.nextInt();
            switch (k) {
                case 1:
                    employee = new Officer();
                    employee.InputPerson();
                    arrs.add(employee);
                    break;
                case 2:
                    employee = new Teller();
                    employee.InputPerson();
                    arrs.add(employee);
                    break;
            }
        }
    }

    public void output() {
        for (int i = 0; i < arrs.size(); i++) {
            arrs.get(i).OutputPerson();
            //System.out.println(arrs.get(i).getClass().getName());
        }
    }

    public double TotalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < arrs.size(); i++) {
            totalSalary += arrs.get(i).calculateSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {

        Bank2 ABC = new Bank2();
        ABC.input();
        ABC.output();
        System.out.println("Total salary: " + ABC.TotalSalary());
    }
}
