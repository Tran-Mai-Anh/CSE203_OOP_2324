/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.util.Comparator;
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
            if (list.get(i).getStudentNumber().equalsIgnoreCase(code)) {
                list.remove(i);
            }
        }
    }

    public void PrintStudentList() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).output();
            System.out.println();
        }
    }

    public void StudentGraduation() {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).graduation()) {
                list.get(i).output();
                System.out.println();
                count++;
            }
        }
        System.out.println("The number of eligible students: " + count);
    }

    public void sort() {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {

                if (s1 instanceof CollegeStudent && s2 instanceof UniversityStudent) {
                    return -1; 
                } else if (s1 instanceof UniversityStudent && s2 instanceof CollegeStudent) {
                    return 1; 
                } else {
                    return s1.getStudentNumber().compareTo(s2.getStudentNumber());
                }
            }
        };
        list.sort(com);
        PrintStudentList();

    }

    public void findStudentName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String n = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFullName().contains(n)) {
                list.get(i).output();
                System.out.println();
            }
        }
    }

}
