/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fractionnumber.fractionnumber;

/**
 *
 * @author maianhtran
 */
public class FractionDemo {

    public static void main(String[] args) {
        Fraction fr1 = new Fraction(3, 5);
        Fraction fr2 = new Fraction(4, 6);
        Fraction fr3 = fr1.Multi(fr2);
        fr3.Display();
        fr3.Simplify();
        fr3.Display();
    }
}
