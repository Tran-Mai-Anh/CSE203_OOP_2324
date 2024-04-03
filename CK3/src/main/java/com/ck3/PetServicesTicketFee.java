/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ck3;

/**
 *
 * @author maianhtran
 */
public class PetServicesTicketFee {

    private final int ticketID;
    private String customerName;
    private String phoneNumber;
    private String type;
    private String size;
    private float basePrice;
    private String services;
    private float voucher;

    public PetServicesTicketFee() {
        this.ticketID = 0;
        this.customerName = "";
        this.phoneNumber = "";
        this.type = "";
        this.size = "";
        this.basePrice = 0;
        this.services = "";
        this.voucher = 0;
    }

    public PetServicesTicketFee(int ticketID, String customerName, String phoneNumber, String type, String size, float basePrice, String services, float voucher) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.size = size;
        this.basePrice = basePrice;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
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
        float typePrice = 0;
        float sizePrice = 0;
        float serviceP1 = 0;
        float serviceP2 = 0;
        float serviceP3 = 0;
        float serviceP4 = 0;
        float serviceP5 = 0;

        if (type.contains("Dog")) {
            typePrice = basePrice * 2;
        }
        if (type.contains("Cat")) {
            typePrice = basePrice * 1;
        }
        if (size.contains("Small")) {
            sizePrice = (float) (typePrice * 0.5);
        }
        if (size.contains("Medium")) {
            sizePrice = typePrice * 1;
        }
        if (size.contains("Large")) {
            sizePrice = (float) (typePrice * 1.5);
        }
        if (size.contains("Extra Large")) {
            sizePrice = typePrice * 2;
        }
        if (services.contains("General Check")) {
            serviceP1 = (float) (sizePrice * 0.5);
        }
        if (services.contains("Washing")) {
            serviceP2 = sizePrice * 1;
        }
        if (services.contains("Grooming")) {
            serviceP3 = (float) (sizePrice * 0.5);
        }
        if (services.contains("Clipping")) {
            serviceP4 = (float) (sizePrice * 0.5);
        }
        if (services.contains("Brushing")) {
            serviceP5 = (float) (sizePrice * 0.5);
        }

        payment = (serviceP1 + serviceP2 + serviceP3 + serviceP4 + serviceP5) - voucher;

        return payment;
    }
}
