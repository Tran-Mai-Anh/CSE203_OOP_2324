/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author maianhtran
 */
public class StudentManager extends Student {

    StudentTableModel studentTableModel = new StudentTableModel();

    protected ArrayList<Student> listStudent = new ArrayList<>();

    public StudentManager() {

    }

    public Student findStudentById(String studentID) {
        for (Student stu : listStudent) {
            if (studentID.equalsIgnoreCase(stu.getStudentID())) {
                return stu;
            }
        }
        return null;
    }

    public boolean addStudent(Student stu) {
        for (Student s : listStudent) {
            if (stu.getStudentID().equalsIgnoreCase(s.getStudentID())) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public StudentTableModel getStudentTableModel() {
        return studentTableModel;
    }

}
