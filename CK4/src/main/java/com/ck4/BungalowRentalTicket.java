/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ck4;

/**
 *
 * @author maianhtran
 */
public class BungalowRentalTicket {

    private int ticketID;
    private String customerName;
    private String customerID;
    private String customerPhone;
    private String bungalowType;
    private int noOfDay;
    private String extraPackage;
    private float voucher;

    public BungalowRentalTicket() {
        this.ticketID = 0;
        this.customerName = "";
        this.customerID = "";
        this.customerPhone = "";
        this.bungalowType = "";
        this.noOfDay = 0;
        this.extraPackage = "";
        this.voucher = 0;
    }

    public BungalowRentalTicket(int ticketID, String customerName, String customerID, String customerPhone, String bungalowType, int noOfDay, String extraPackage, float voucher) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerPhone = customerPhone;
        this.bungalowType = bungalowType;
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

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getBungalowType() {
        return bungalowType;
    }

    public void setBungalowType(String bungalowType) {
        this.bungalowType = bungalowType;
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

    public float getPayment() {
        float payment = 0;
        int price = 0;
        int E1 = 0;
        int E2 = 0;
        int E3 = 0;

        if (bungalowType.contains("Single")) {
            price = 100;
        }
        if (bungalowType.contains("Double")) {
            price = 150;
        }
        if (bungalowType.contains("Deluxe")) {
            price = 200;
        }
        if (bungalowType.contains("Presidential")) {
            price = 500;
        }
        if (extraPackage.contains("Buffet")) {
            E1 = 50;
        }
        if (extraPackage.contains("Spa")) {
            E2 = 40;
        }
        if (extraPackage.contains("Gym")) {
            E3 = 10;
        }
        payment = (price + E1 + E2 + E3) * noOfDay - voucher;

        return payment;
    }

    @Override
    public String toString() {
        return "Ticket ID:\t\t" + ticketID + "\n"
                + "Customer Name:\t" + customerName + "\n"
                + "Customer ID:\t\t" + customerID + "\n"
                + "Customer Phone:\t" + customerPhone + "\n"
                + "No Of Day:\t\t" + noOfDay + "\n"
                + "Bungalow Type:\t" + bungalowType + "\n"
                + "Extra Package:\t\t" + extraPackage + "\n"
                + "----*----Payment:\t" + getPayment();
    }

}
