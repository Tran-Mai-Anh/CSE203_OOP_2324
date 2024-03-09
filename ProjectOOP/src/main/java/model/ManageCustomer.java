/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author maianhtran
 */
public class ManageCustomer {

    private ArrayList<Customer> listCustomer = new ArrayList<>();

    public ArrayList<Customer> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(ArrayList<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public ManageCustomer() {
        this.listCustomer = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        listCustomer.add(c);
    }

    public void deleteCustomer(Customer c) {
        listCustomer.remove(c);
    }

    public Customer findCustomer(String customerID) {
        for (Customer c : listCustomer) {
            if (c.getCustomerID().equalsIgnoreCase(customerID)) {
                return c;
            }
        }
        return null;
    }

    public boolean searchCustomerByID(Customer customer) {
        for (Customer c : listCustomer) {
            if (customer.getCustomerID().equalsIgnoreCase(c.getCustomerID())) {
                return false;
            }
        }
        return true;
    }

    /*public void editCustomer(Customer newCustomer) {
        Customer oldCustomer = findCustomer(newCustomer.getCustomerID());
        boolean flag = searchCustomerByID(newCustomer.getCustomerID());
        if (flag) {
            oldCustomer.setCustomerName(newCustomer.getCustomerName());
            oldCustomer.setAddress(newCustomer.getAddress());
            oldCustomer.setPhoneNumber(newCustomer.getPhoneNumber());
            oldCustomer.setEmail(newCustomer.getEmail());
        }
    }*/

    public ArrayList<Customer> searchCustomerByName(String name) {
        ArrayList<Customer> listC = new ArrayList<>();
        for (Customer c : this.listCustomer) {
            if (c.getCustomerName().contains(name)) {
                listC.add(c);
            }
        }
        return listC;
    }

}
