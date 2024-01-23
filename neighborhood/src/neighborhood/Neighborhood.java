/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.neighborhood;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Neighborhood {

    public static void main(String[] args) {
        //Neighborhood neighborhood = new Neighborhood();
       // neighborhood.InputNeighborhood();
       // neighborhood.OutputNeighborhood();
        // Person person1 = new Person();
        // person1.InputPerson();
        // Person person2 = new Person("Nguyen Van ","An",12," hoc sinh","1234");
        // person1.OutputPerson();
        // person2.OutputPerson();
               Household house = new Household();
         house.InputHousehold();
         house.OutputHousehold();
         System.out.println(house.CountAgeOver60());

    }
    //Thuoc tinh
    ArrayList<Household> house = new ArrayList<Household>();

    //phuong thuc
    Neighborhood() { // ham khoi tao k nhap gi nhung nhat dinh phai co

    }

    void InputNeighborhood() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of neighborhood: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Household p = new Household();
            p.InputHousehold();
            house.add(p);
        }
    }

    void OutputNeighborhood() {
        for (int i = 0; i < house.size(); i++) {
            house.get(i).OutputHousehold();
        }
    }
}
