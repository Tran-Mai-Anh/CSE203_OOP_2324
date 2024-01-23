/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author maianhtran
 */
public class ComplexNumber {

    public static void main(String[] args) {
        Complex a = new Complex();
        a.input();
        Complex b = new Complex();
        b.input();
        a.print();
        b.print();
        Complex c = a.plus(b);
        c.print();
        Complex d = a.minus(b);
        d.print();
        Complex e = a.multiply(b);
        e.print();
        Complex f = a.division(b);
        f.print();
    }
}
