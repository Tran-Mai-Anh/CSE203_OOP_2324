/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demogenerics;

/**
 *
 * @author maianhtran
 */
public class DemoGenerics {

    public static void main(String[] args) {
        DemoNumber<Integer> num = new DemoNumber<Integer>(5, 7);
        num.Output();
        DemoNumber<Double> num2 = new DemoNumber<Double>(4.4, 7.2);
        num2.Output();
    }
}
