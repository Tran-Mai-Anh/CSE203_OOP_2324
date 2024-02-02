/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author maianhtran
 */
enum BankType {
    TPBank,
    VietcomBank;
}

public class BankFactory {

    public static Bank getBankName(BankType bankType) {
        switch (bankType) {
            case TPBank:
                return new TPBank();
            case VietcomBank:
                return new VietcomBank();
        }
        return null;
    }
}
