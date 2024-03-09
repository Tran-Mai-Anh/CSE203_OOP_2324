/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author maianhtran
 */
public class SingletonPattern {
    public static void main(String[]args){
        CompanyInfo companyInfo=CompanyInfo.getInstance();
        
        companyInfo.displayInfo();
        
        companyInfo.setCompanyName("EIU-Đại học quốc tế Miền Đông");
        companyInfo.setAddress("3M38+6F3, Nam Kỳ Khởi Nghĩa, Định Hoà, Thủ Dầu Một, Bình Dương");
        companyInfo.setPhoneNumber("(+84) 0274 222 0372");
        
        companyInfo.displayInfo();
    }
    
}
