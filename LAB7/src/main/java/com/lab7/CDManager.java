/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab7;

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
public class CDManager extends CD {

    private ArrayList<CD> listCD;

    public CDManager() {
        this.listCD = new ArrayList<CD>();
    }

    /*public CD findCDById(String studentID) {
        for (CD cd : listCD) {
            if (studentID.equalsIgnoreCase(cd.getId())) {
                return cd;
            }
        }
        return null;
    }*/
    private boolean addCD(CD stu) {
        for (CD cd : listCD) {
            if (cd.getId().equalsIgnoreCase(cd.getId())) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<CD> getListCD() {
        return listCD;
    }

    public void setListCD(ArrayList<CD> listCD) {
        this.listCD = listCD;
    }

    public ArrayList<CD> getListCDByTitle(String title) {
        ArrayList<CD> result = new ArrayList<>();
        CD cd;
        for (int i = 0; i < listCD.size(); i++) {
            cd = listCD.get(i);
            if (cd.getTitle().contains(title)) {
                result.add(cd);
            }
        }
        return result;
    }

    public ArrayList<CD> getListCDByCollection(String collection) {
        ArrayList<CD> result = new ArrayList<>();
        CD cd;
        for (int i = 0; i < listCD.size(); i++) {
            cd = listCD.get(i);
            if (cd.getCollection().contains(collection)) {
                result.add(cd);
            }
        }
        return result;
    }

    public ArrayList<CD> getListCDByType(String type) {
        ArrayList<CD> result = new ArrayList<>();
        CD cd;
        for (int i = 0; i < listCD.size(); i++) {
            cd = listCD.get(i);
            if (cd.getType().contains(type)) {
                result.add(cd);
            }
        }
        return result;
    }

    public ArrayList<CD> getListCDByPrice(double price) {

        ArrayList<CD> result = new ArrayList<>();
        CD cd;
        for (int i = 0; i < listCD.size(); i++) {
            cd = listCD.get(i);
            if (cd.getPrice() == price) {
                result.add(cd);
            }
        }
        return result;
    }

}
