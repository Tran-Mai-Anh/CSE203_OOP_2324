/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ck2;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Package {

    private String fromAddress;
    private String toAddress;
    private float basePrice;
    private String type;
    private String deliveryOption;
    private String services;
    private float insuranceValue;

    public Package(String fromAddress, String toAddress, float basePrice, String type, String deliveryOption, String services, float insuranceValue) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.basePrice = basePrice;
        this.type = type;
        this.deliveryOption = deliveryOption;
        this.services = services;
        this.insuranceValue = insuranceValue;
    }

    public Package() {
        this.fromAddress = "";
        this.toAddress = "";
        this.basePrice = 0;
        this.type = "";
        this.deliveryOption = "";
        this.services = "";
        this.insuranceValue = 0;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public float getInsuranceValue() {
        return insuranceValue;
    }

    public void setInsuranceValue(float insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    public float calculatePayment() {
        Scanner sc = new Scanner(System.in);

        float payment = 0;
        float insuranceCost = 0;

        if (type.contains("Envelope")) {
            payment = (float) (0.8 * basePrice);
        }

        if (type.contains("Small Box")) {
            payment = (float) (1.2 * basePrice);
        }

        if (type.contains("Medium Box")) {
            payment = (float) (1.5 * basePrice);
        }

        if (type.contains("Large Box")) {
            payment = (float) 2 * basePrice;
        }

        if (deliveryOption.contains("Normal Delivery")) {
            payment += 0;
        }

        if (deliveryOption.contains("Express")) {
            payment += 30;
        }

        if (services.contains("Signature Confirmation")) {
            payment += 2;
        }

        if (services.contains("Insurance")) {
            float valueOfInsurance = sc.nextFloat();
            insuranceCost = (float) (0.02 * valueOfInsurance);
            if (insuranceCost < 5) {
                insuranceCost = 5;
            }
            payment += insuranceCost;
        }

        return payment;
    }
    
    /*public String print() {
    String output = "Ticket ID:\t" + ticketID + "\n"
            + "Customer:\t" + customerName + "\n"
            + "Brand:\t" + brand + "\n"
            + "Model:\t" + model + "\n"
            + "Type:\t" + type + "\n"
            + "Color:\t" + color + "\n"
            + "Services:\t" + services + "\n";

    // Kiểm tra nếu là Express và được chọn
    if (deliveryOption.equals("Express") && expressCheckbox.isSelected()) {
        output += "Mark the package \"Priority Mail\" in the postage area.\n";
    }

    output += "----*----Payment:\t" + getPayment();
    
    return output;
}*/

}
