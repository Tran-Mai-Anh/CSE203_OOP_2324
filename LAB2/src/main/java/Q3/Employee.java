/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author maianhtran
 */
public class Employee {
    String code;
    String fullName;
    int numberOfYearOfService;
    double salaryCoefficient;
    double basicSalary;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberOfYearOfService() {
        return numberOfYearOfService;
    }

    public void setNumberOfYearOfService(int numberOfYearOfService) {
        this.numberOfYearOfService = numberOfYearOfService;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public Employee(){
        
    }
    public Employee(String code,String fullName,int numberOfYearOfService,double salaryCoefficient,double basicSalary){
        this.code=code;
        this.fullName=fullName;
        this.numberOfYearOfService=numberOfYearOfService;
        this.salaryCoefficient=salaryCoefficient;
        this.basicSalary=basicSalary;
    }
    
}
