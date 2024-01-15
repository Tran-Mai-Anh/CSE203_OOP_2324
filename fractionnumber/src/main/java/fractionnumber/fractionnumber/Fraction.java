/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fractionnumber.fractionnumber;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int Getnumerator() {
        return numerator;
    }

    public int Getdenominator() {
        return denominator;
    }

    public void Display() {
        System.out.println(numerator + "/" + denominator);
    }

    public void Inverse() {
        int t = numerator;
        numerator = denominator;
        denominator = t;
    }

    private int GeneralDivisor() {
        int a = numerator;
        int b = denominator;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void Simplify() {
        int t = GeneralDivisor();
        numerator /= t;
        denominator /= t;
    }

    public Fraction Multi(Fraction c) {
        Fraction result = new Fraction(this.numerator * c.numerator, this.denominator * c.denominator);
        return result;
    }
}
