/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import Q1.CD;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class List {

    ArrayList<Employee> FullList = new ArrayList<>();
    ArrayList<Employee> PartList = new ArrayList<>();

    public List() {
    }

    public void addFullTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter the number of full-time employee: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee f = new FullTimeEmployee();
            f.input();
            FullList.add(f);
        }
    }

    public void addPartTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter the number of part-time employee: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee p = new PartTimeEmployee();
            p.input();
            PartList.add(p);
        }

    }

    public void outputFullTime() {
        for (Employee e : FullList) {
            if (e instanceof FullTimeEmployee) {
                System.out.println(e.getInfo());
            }
        }
    }

    public void outputPartTime() {
        for (Employee e : PartList) {
            if (e instanceof PartTimeEmployee) {
                System.out.println(e.getInfo());
            }
        }
    }

    public void outputAll() {
        for (Employee e : FullList) {
            System.out.println(e.getInfo());
        }
        for (Employee e : PartList) {
            System.out.println(e.getInfo());
        }
    }

    public void searchById() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter employee's Id: ");
        String Id = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < FullList.size(); i++) {
            if (FullList.get(i).employeeID.equalsIgnoreCase(Id)) {
                System.out.println(FullList.get(i).getInfo());
                flag = true;
            }
        }
        for (int i = 0; i < PartList.size(); i++) {
            if (FullList.get(i).employeeID.equalsIgnoreCase(Id)) {
                System.out.println(PartList.get(i).getInfo());
                flag = true;
            }
        }

        if (!flag) {
            System.out.print(" - Wrong input");
        }
    }

    public void deleteById() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter employee's Id: ");
        String id = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < FullList.size(); i++) {
            if (FullList.get(i).employeeID.equalsIgnoreCase(id)) {
                FullList.remove(i);
                flag = true;
            }
        }
        for (int i = 0; i < PartList.size(); i++) {
            if (PartList.get(i).employeeID.equalsIgnoreCase(id)) {
                PartList.remove(i);
                flag = true;
            }
        }
        if (!flag) {
            System.out.print(" - Wrong input");
        }
    }

    public void Edit() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter employee's Id: ");
        String id = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < FullList.size(); i++) {
            if (FullList.get(i).employeeID.equalsIgnoreCase(id)) {
                FullList.get(i).input();
                FullList.get(i).setEmployeeID(id);
                flag = true;
            }
        }
        for (int i = 0; i < PartList.size(); i++) {
            if (PartList.get(i).employeeID.equalsIgnoreCase(id)) {
                PartList.get(i).input();
                PartList.get(i).setEmployeeID(id);
                flag = true;
            }
        }
        if (!flag) {
            System.out.print(" - Wrong input");
        }
    }

    public void searchByPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter payment from: ");
        float fromPay = sc.nextFloat();
        System.out.print(" - To: ");
        float toPay = sc.nextFloat();

        boolean flag = false;
        for (int i = 0; i < FullList.size(); i++) {
            if (fromPay <= FullList.get(i).getPayment() && FullList.get(i).getPayment() <= toPay) {
                System.out.println(FullList.get(i).getInfo());
                flag = true;
            }
        }
        for (int i = 0; i < PartList.size(); i++) {
            if (fromPay <= PartList.get(i).getPayment() && PartList.get(i).getPayment() <= toPay) {
                System.out.println(PartList.get(i).getInfo());
                flag = true;
            }
        }
        if (!flag) {
            System.out.print(" - Wrong input");
        }

    }

    public void sort() {

        Comparator<Employee> com = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                
                if (e1.yearOfBirth == e2.yearOfBirth) {
                    if (e1.getPayment() > e2.getPayment()) {
                        return -1;
                    } else if (e1.getPayment() < e2.getPayment()) {
                        return 1;

                    } else {
                        return 0;
                    }
                }
                if (e1.yearOfBirth > e2.yearOfBirth) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        System.out.println("Sort Full-time employee: ");
        FullList.sort(com);
        //outputFullTime();
        System.out.println("Sort Part-time employee: ");
        PartList.sort(com);
        outputAll();
    }

}
