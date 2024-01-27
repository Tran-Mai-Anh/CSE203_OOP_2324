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
public class HR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new List();

        int menu;
        do {
            System.out.printf("1. Add Full-time Employee\n"
                    + "2. Add part-time Employee\n"
                    + "3. Show all Full-time Employee\n"
                    + "4. Show all Part-time Employee\n"
                    + "5. Show all Employee\n"
                    + "6. Search Employee by Id\n"
                    + "7. Delete Employee by Id\n"
                    + "8. Edit Employee information by Id\n"
                    + "9. Search Employee by payment\n"
                    + "10. Sort Full-time Employee and Part-Time employee in ascending order by age, payment.\n"
                    + "11. Exit\nInput: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    list.addFullTimeEmployee();
                    break;
                case 2:
                    list.addPartTimeEmployee();
                    break;
                case 3:
                    list.outputFullTime();
                    break;
                case 4:
                    list.outputPartTime();
                    break;
                case 5:
                    list.outputAll();
                    break;
                case 6:
                    list.searchById();
                    break;
                case 7:
                    list.deleteById();
                    break;
                case 8:
                    list.Edit();
                    break;
                case 9:
                    list.searchByPayment();
                    break;
                case 10:
                    list.sort();
                    break;
                case 11:
                    break;

            }
        } while (menu != 11);
    }
}
