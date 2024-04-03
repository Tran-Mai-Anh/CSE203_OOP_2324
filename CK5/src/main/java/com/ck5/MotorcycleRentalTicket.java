/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ck5;

/**
 *
 * @author maianhtran
 */
public class MotorcycleRentalTicket {

    private int ticketID;
    private String customerName;
    private String customerID;
    private String licensePlatesNumbers;
    private String motorcycleType;
    private int noOfDay;
    private String extraPackage;
    private float voucher;

    public MotorcycleRentalTicket() {
        this.ticketID = 0;
        this.customerName = "";
        this.customerID = "";
        this.licensePlatesNumbers = "";
        this.motorcycleType = "";
        this.noOfDay = 0;
        this.extraPackage = "";
        this.voucher = 0;
    }

    public MotorcycleRentalTicket(int ticketID, String customerName, String customerID, String licensePlatesNumbers, String motorcycleType, int noOfDay, String extraPackage, float voucher) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.customerID = customerID;
        this.licensePlatesNumbers = licensePlatesNumbers;
        this.motorcycleType = motorcycleType;
        this.noOfDay = noOfDay;
        this.extraPackage = extraPackage;
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

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getLicensePlatesNumbers() {
        return licensePlatesNumbers;
    }

    public void setLicensePlatesNumbers(String licensePlatesNumbers) {
        this.licensePlatesNumbers = licensePlatesNumbers;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public int getNoOfDay() {
        return noOfDay;
    }

    public void setNoOfDay(int noOfDay) {
        this.noOfDay = noOfDay;
    }

    public String getExtraPackage() {
        return extraPackage;
    }

    public void setExtraPackage(String extraPackage) {
        this.extraPackage = extraPackage;
    }

    public float getVoucher() {
        return voucher;
    }

    public void setVoucher(float voucher) {
        this.voucher = voucher;
    }

    public float getPaymnet() {
        float payment = 0;
        int price = 0;
        int E1 = 0;
        int E2 = 0;
        int E3 = 0;

        if (motorcycleType.contains("Scooter")) {
            price = 50;
        }
        if (motorcycleType.contains("Naked Bike")) {
            price = 100;
        }
        if (motorcycleType.contains("Adventure Bike")) {
            price = 150;
        }
        if (motorcycleType.contains("Cruiser")) {
            price = 200;
        }
        if (extraPackage.contains("Helmet")) {
            E1 = 15;
        }
        if (extraPackage.contains("Suite")) {
            E2 = 20;
        }
        if (extraPackage.contains("Cargo Box")) {
            E3 = 10;
        }

        payment = (price + E1 + E2 + E3) * noOfDay - voucher;

        return payment;
    }

}
