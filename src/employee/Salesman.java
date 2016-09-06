/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
/**
 *
 * @author bbroadstone
 */
public class Salesman extends Employee {
    private double yearlySales;
    
//A constructor that allows the name and monthly salary to be initialized.
    
    public Salesman() {
    }

    public Salesman(int year, String name, double monthlyPay, double yearlySales) {
        super(year, name, monthlyPay);
        this.yearlySales = yearlySales;
    }
    
//An overridden method annualSalary that returns the salary for a whole year.
//The salary for a salesman consists of the base salary computed from the 
//monthly salary plus a commission. The commission is computed as 2% of that 
//salesman's annual sales. The maximum commission a salesman can earn is 
//$20,000.

    public double annualSalary() {
        double commission = this.yearlySales * .02;
        
        if (commission > 20000) {
            commission = 20000;
        }
        return super.annualSalary() + commission;
    }

    public String toString() {
        return super.toString() + "\n" + "Sales for The Year: \t\t" +
                df.format(this.yearlySales);
    }
    
//Getter and Setter methods
    
    public double getYearlySales() {
        return yearlySales;
    }

    public void setAnnualSales(double annualSales) {
        this.yearlySales = annualSales;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public double getMonthlySalary() {
        return super.getMonthlyPay();
    }

    public void setMonthlySalary(double monthlyPay) {
        super.setMonthlyPay(monthlyPay);
    }

    public int getYear() {
        return super.getYear();
    }

    public void setYear(int year) {
        super.setYear(year);
    }
}