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
        System.out.print("Enter the number of CD: ");
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
        System.out.print("Enter the CD title: ");
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
        System.out.print("Enter the collection: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDcollection().equalsIgnoreCase(n)) {
                CDs.get(i).print();
            }
        }
    }

    public void searchType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDtype().equalsIgnoreCase(n)) {
                CDs.get(i).print();
            }
        }
    }

    public void deleteId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equalsIgnoreCase(n)) {
                CDs.remove(i);
            }
        }
    }

    public void editInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equalsIgnoreCase(n)) {
                CDs.get(i).input();
                CDs.get(i).setCDId(n);
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
