/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author maianhtran
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class CDList {

    ArrayList<CD> CDs = new ArrayList<>();

    public CDList() {

    }

    public void displayAllCDs() {
        for (int i = 0; i < CDs.size(); i++) {
            CDs.get(i).print();
        }
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of CD to add: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            CD cd = new CD();
            cd.input();
            CDs.add(cd);
        }
        displayAllCDs();
    }

    public void searchTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CD title: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getTitle().equalsIgnoreCase(n)) {
                CDs.get(i).print();
                break;
            }
        }
    }

    public void searchCollection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the collection: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDcollection().equalsIgnoreCase(n)) {
                CDs.get(i).print();
            }
        }
    }

    public void searchType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDtype().equalsIgnoreCase(n)) {
                CDs.get(i).print();
            }
        }
    }

    public void deleteId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equalsIgnoreCase(n)) {
                CDs.remove(i);
            }
        }
        displayAllCDs();
    }

    public void editInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equalsIgnoreCase(n)) {
                String t1 = "";
                double t2 = 0;
                int t3 = 0;
                System.out.println("CD collection (game/ movie/ music): ");
                t1=sc.nextLine();
               /* if (t1 != "") {
                    CDs.get(i).CDcollection = CDs.get(i).CDcollection;
                } else {
                    t1 = CDs.get(i).CDcollection;
                }

                System.out.println("CD type (audio or video): ");
                t1 = "";
                t1=sc.nextLine();
                if (t1 != "") {
                    CDs.get(i).CDtype = CDs.get(i).CDtype;
                } else {
                    t1 = CDs.get(i).CDtype;
                }

                System.out.println("Title: ");
                t1 = "";
                t1=sc.nextLine();
                if (t1 != "") {
                    CDs.get(i).Title = CDs.get(i).Title;
                } else {
                    t1 = CDs.get(i).Title;
                }

                System.out.println("Price: ");
                t2=sc.nextDouble();
                if (t2 != 0) {
                    CDs.get(i).Price = CDs.get(i).Price;
                } else {
                    t2 = CDs.get(i).Price;
                }

                System.out.println("Year of release: ");
                t3=sc.nextInt();
                if (t3 != 0) {
                    CDs.get(i).yearOfRelease = CDs.get(i).yearOfRelease;
                } else {
                    t3 = CDs.get(i).yearOfRelease;
                }

                break;*/
            }
        }
    }

    public void sort() {
        Comparator<CD> com = new Comparator<CD>() {
            public int compare(CD o1, CD o2) {
                return o1.getYearOfRelease() - o2.getYearOfRelease();
            }
        };
        CDs.sort(com);
        displayAllCDs();
    }

}