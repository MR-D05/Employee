/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author bbroadstone
 */

public class Main {
    
//These fields are private and represent seperate arrays for the seperate
//years of employee info.
    
    private ArrayList<Employee> arrayFor2014 = new ArrayList<>();
    private ArrayList<Employee> arrayFor2015 = new ArrayList<>();
    
//This is a private DecimalFormat object to format method calls.
    
    private static DecimalFormat df = new DecimalFormat("$,000.00");   
    
//The create() method reads the "data.txt" file. The Scanner class then 
//initializes the variables inbetween whitespaces. The "data.txt" contains
//information pertinent to this assignment for the respective classes ending
//with a blank line as required by Scanner. The data will populate the arrays 
//depending on particular data in each line of the "data.txt" file.    
    
    public void create() {
        try {
            Scanner input = new Scanner(new File("data.txt"));
            
//Loop will terminate when method has no more data to read.
            
            while (input.hasNext()) {
                int year = input.nextInt();
                
//Checks if first element is 2014.

                    if (year == 2014) {
                    String type = input.next();
                    String name = input.next();
                    double monthlyPay = input.nextDouble();
                    
//Checks second element for Salesman value and takes in data if so.
                    
                    if (type.equals("Salesman")) {
                    double finalElement = input.nextDouble();
                    arrayFor2014.add(new Salesman(year, name, monthlyPay, finalElement));
                        
//Checks second element for Executive value and takes in data if so.

                    } 
                    else if (type.equals("Executive")) {
                    double finalElement = input.nextDouble();
                    arrayFor2014.add(new Executive(year, name, monthlyPay, finalElement));
                        
//Element will be Employee because failed test otherwise.

                    } 
                    else {
                    arrayFor2014.add(new Employee(year, name, monthlyPay));
                    }          
                    } 
                
//Checks if first element is 2015.
                
                    else if (year == 2015) {
                    String type = input.next();
                    String name = input.next();
                    double monthlyPay = input.nextDouble();
                    
//Checks second element for Salesman value and takes in data if so.
                    
                    if (type.equals("Salesman")) {
                        double finalElement = input.nextDouble();
                        arrayFor2015.add(new Salesman(year, name, monthlyPay, finalElement));                       
                    }
                    
//Tests for Executive in the second element.
                    
                    else if (type.equals("Executive")) {
                        double finalElement = input.nextDouble();
                        arrayFor2015.add(new Executive(year, name, monthlyPay, finalElement));                   
                    } 
                    
//Element will be Employee because failed test otherwise.
                    
                    else {
                        arrayFor2015.add(new Employee(year, name, monthlyPay));
                    }
                }
                
//Scanner consumes blank line and terminates.
                
                    input.nextLine();
            }         
        }        
        catch (IOException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } 
        catch (NullPointerException e) {
            System.out.println("A null pointer was found, please check the input file.");
            e.printStackTrace();
        }        
        catch (NoSuchElementException e) {
            System.out.println("The last line of the document is not blank.");
            e.printStackTrace();
        }
    }

//Once all the employee data is read in, a report should be displayed on the 
//console for each of the two years. Each line of the report should contain all 
//original data supplied for each employee together with that employee's annual
//salary for the year. For each of the two years, an average of all salaries for
//all employees for that year should be computed and displayed.

    public void displayOutput() {

//Temporary variables for annual salary average.
        
        double avg2014 = 0;
        double avg2015 = 0;

//Refer to array, calculate, and display employee's annual salary for 2014.
        
        System.out.println("Output for 2014:");
        for (Employee employee : arrayFor2014) {
            System.out.println(employee.toString());
            avg2014 += employee.annualSalary();
        }

//Total average salary for 2014 must be divided by total number of employees.
        
        avg2014 = avg2014 / arrayFor2014.size();
        System.out.println("\n" + "Average Employee's Salary for 2014: " + df.format(avg2014));

//Refer to array, calculate, and display employee's annual salary for 2015.

        System.out.println("\n" + "Output for 2015:");
        for (Employee em : arrayFor2015) {
            System.out.println(em.toString());
            avg2015 += em.annualSalary();
        }

//Total average salary for 2014 must be divided by total number of employees.
        
        avg2015 = avg2015 / arrayFor2015.size();
        System.out.println("\n" + "Average Employee's Salary for 2015: " + df.format(avg2015));
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.create();
        list.displayOutput();        
    }
}
