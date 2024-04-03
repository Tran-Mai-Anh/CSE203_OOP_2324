/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ack1;

/**
 *
 * @author maianhtran
 */
public class ShoesServicesTicket {

    private int ticketID;
    private String customerName;
    private String brand;
    private String model;
    private String color;
    private String type;
    private float laborPrice;
    private String services;
    private float voucher;

    public ShoesServicesTicket() {
        this.ticketID = 0;
        this.customerName = "";
        this.brand = "";
        this.model = "";
        this.color = "";
        this.type = "";
        this.laborPrice = 0;
        this.services = "";
        this.voucher = 0;
    }

    public ShoesServicesTicket(int ticketID, String customerName, String brand, String model, String color, String type, float laborPrice, String services, float voucher) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.laborPrice = laborPrice;
        this.services = services;
        this.voucher = voucher;
    }

    public int getTicketID() {
        return ticketID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getLaborPrice() {
        return laborPrice;
    }

    public void setLaborPrice(float laborPrice) {
        this.laborPrice = laborPrice;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public float getVoucher() {
        return voucher;
    }

    public void setVoucher(float voucher) {
        this.voucher = voucher;
    }

    public float getPayment() {
        float payment = 0;
        int S1 = 0;
        int S2 = 0;
        int S3 = 0;
        int S4 = 0;
        int S5 = 0;
        int servicePrice = 0;

        if (services.contains("Washing")) {
            S1 = 5;
        }
        if (services.contains("Renew Upper")) {
            S2 = 10;
        }
        if (services.contains("Renew Sole")) {
            S3 = 15;
        }
        if (services.contains("Repair")) {
            S4 = 20;
        }
        if (services.contains("Custom Paint")) {
            S5 = 40;
        }

        servicePrice = S1 + S2 + S3 + S4 + S5;
        
        if (type.contains("Sandals")) {
            payment = laborPrice + servicePrice;
        }
        if (type.contains("Sneakers")) {
            payment = (float) (laborPrice * 1.5 + servicePrice);
        }
        if (type.contains("Leather Shoes")) {
            payment = laborPrice * 2 + servicePrice;
        }

        payment -= voucher;

        return payment;
    }

    public String print() {
        return "Ticket ID:\t" + ticketID + "\n"
                + "Customer:\t" + customerName + "\n"
                + "Brand:\t" + brand + "\n"
                + "Model:\t" + model + "\n"
                + "Type:\t" + type + "\n"
                + "Color:\t" + color + "\n"
                + "Services:\t" + services + "\n"
                + "----*----Payment:\t" + getPayment();
    }
}