This is one of the first student programming projects I wrote. It is written in Java, and it computes the salaries for a collection of employees of different types. 

This program consists of four classes. The first class is the "Employee" class, which contains the employee's name and monthly salary, which is specified in whole dollars. It has three methods: A constructor that allows the name and monthly salary to be initialized, a method named "annualSalary" that returns the salary for a whole year, and a "toString" method that returns a string containing the name and monthly salary, appropriately labeled.

The "Employee" class has two subclasses. The first is "Salesman." It has an additional instance variable that contains the annual sales in whole dollars for that salesman. This subclass itself has three methods: A constructor that allows the name, monthly salary and annual sales to be initialized, an overridden method "annualSalary" that returns the salary for a whole year, and an overridden "toString" method that returns a string containing the name, monthly salary, and annual sales for an employee.

The second subclass is named "Executive." It has an additional instance variable that reflects the current stock price. This subclass has the same three methods as "Employee.:

There is also a fourth class that contains the main method. It reads in employee information from a text file. Each line of the text file represents information for an employee for a particular year like this:

2014 Employee Smith,John 2000
2015 Salesman Jones,Bill 3000 100000 
2014 Executive Bush,George 5000 55

Where the year is the first element of a particular line. The second element is the type of the employee followed by the employee name and his or her monthly salary.

As employees are read in by the program, "Employee" objects are created and stored in arrays depending upon the year.

Once all employee data is read in, a report is displayed on the console for each of the two years detailed in the file. Each line of the report contain all original data supplied for each employee together with that employee's annual salary for the year. For each of the two years, an average of all salaries for all employees for that year is computed and displayed.
