/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.text.DecimalFormat;
/**
 *
 * @author bbroadstone
 */

public class Employee {
    private String name;
    private double monthlyPay;
    private int year;
    static DecimalFormat df = new DecimalFormat("$,000.00");

//A constructor that allows the name and monthly salary to be initialized.
    
    public Employee() {      
    }
    
    public Employee(int year, String name, double monthlyPay) {
        this.year = year;
        this.name = name;
        this.monthlyPay = monthlyPay;
    }
    
//A method named annualSalary that returns the salary for a whole year.
    
    public double annualSalary() {
        return this.monthlyPay * 12;
    }
    
//A toString method that returns a string containing the name and monthly 
//salary, appropriately labeled.
    
    public String toString() {
        return "\n" + "Employee's Name: \t\t" + this.name +
                "\n" + "Salary for the Year: \t\t" + df.format(this.annualSalary());
    }
    
//Getter and Setter methods
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getMonthlyPay() {
        return monthlyPay;
    }
    
    public void setMonthlyPay(double monthlySalary) {
        this.monthlyPay = monthlySalary;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
}
