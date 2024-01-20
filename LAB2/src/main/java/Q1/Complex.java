/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Complex {

    private double re;
    private double im;

    public Complex() {

    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double GetA() {
        return re;
    }

    public double GetB() {
        return im;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("re: ");
        re = sc.nextDouble();
        System.out.print("im: ");
        im = sc.nextDouble();
    }

    public void print() {
        System.out.println(re + "+" + im + "i");
    }

    public Complex plus(Complex c) {
        System.out.println("Plus: ");
        Complex result = new Complex(this.re + c.re, this.im + c.im);
        return result;
    }

    public Complex minus(Complex c) {
        System.out.println("Minus: ");
        Complex result = new Complex(this.re - c.re, this.im - c.im);
        return result;
    }

    public Complex multiply(Complex c) {
        System.out.println("Multiply: ");
        Complex result = new Complex(this.re * c.re - this.im * c.im, this.re * c.im + c.re * this.im);
        return result;
    }

    public Complex division(Complex c) {
        System.out.println("Division: ");
        Complex result = new Complex((this.re * c.re + this.im * c.im) / (c.re * c.re + c.im * c.im), (this.im * c.re - this.re * c.im) / (c.re * c.re + c.im * c.im));
        return result;
    }

}
