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
public class Executive extends Employee{
    private double stockValue;
    
//A constructor that allows the name, monthly salary and annual sales to be initialized.
    
    public Executive() {       
    }

    public Executive(int year, String name, double monthlyPay, double stockValue) {
        super(year, name, monthlyPay);
        this.stockValue = stockValue;
    }

//A method named annualSalary that returns the salary for a whole year.

    public double annualSalary() {
        double bonus = 0;

//The bonus is $30,000 if the current stock price is greater than $50 and 
//nothing otherwise.

        if (this.stockValue > 50) {
            bonus = 30000;
        }

        return super.annualSalary() + bonus;
    }

//A toString method that returns a string containing the name and monthly 
//salary, appropriately labeled.    
    
    public String toString() {       
        return super.toString() + "\nStock Price: \t\t\t" +
                df.format(this.stockValue);
    }

//Getter and Setter methods

    public double getStockPrice() {
        return stockValue;
    }

    public void setStockPrice(double stockPrice) {
        this.stockValue = stockPrice;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public double getMonthlyPay() {
        return super.getMonthlyPay();
    }

    public void setMonthlyPay(double monthlyPay) {
        super.setMonthlyPay(monthlyPay);
    }

    public int getYear() {
        return super.getYear();
    }

    public void setYear(int year) {
        super.setYear(year);
    }
}