/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class College extends Student {

    private double graduationExamScores;

    public College(double graduationExamScores, String studentNumber, String fullName, int credits, double avgScore) {
        super(studentNumber, fullName, credits, avgScore);
        this.graduationExamScores = graduationExamScores;
    }

    public double getGraduationExamScores() {
        return graduationExamScores;
    }

    public void setGraduationExamScores(double graduationExamScores) {
        this.graduationExamScores = graduationExamScores;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Graduation exam scores: ");
        graduationExamScores = sc.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.print(" - Graduation exam scores: " + graduationExamScores);
    }
}
