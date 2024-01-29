/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author maianhtran
 */
public class List {

    public List() {
    }
    Vector<Student> list = new Vector<>();

    public void AddCollegeStudent() {
        Student student = new CollegeStudent();
        student.input();
        list.add(student);
    }

    public void AddUniversityStudent() {
        Student student = new UniversityStudent();
        student.input();
        list.add(student);
    }

    public void RemoveStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's code: ");
        String code = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentNumber() == code) {
                list.remove(i);
            }
        }
    }

    public void PrintStudentList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void StudentGraduation() {
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).graduation()) {
                System.out.println(list.get(i));
                count++;
            }
        }
        System.out.println(count);
    }

}
