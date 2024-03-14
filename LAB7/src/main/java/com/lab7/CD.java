/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab7;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class CD implements Serializable {

    Scanner sc = new Scanner(System.in);

    private String id;
    private String title;
    private String collection;
    private String type;
    private double price;
    private int year;

    public CD() {

    }

    public CD(String id, String title, String collection, String type, double price, int year) {
        this.id = id;
        this.title = title;
        this.collection = collection;
        this.type = type;
        this.price = price;
        this.year = year;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    

}
