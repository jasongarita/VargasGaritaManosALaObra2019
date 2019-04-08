/*
 * Employees List Class
 */
package Data;

/**
 *
 * @author Jason
 */
import Domain.Employee;

import java.util.Vector;

public class EmployeeData extends Employee{

    public EmployeeData(String name, String lastName, double Salary, String ID, int employeeNumber) {
        super(name, lastName, Salary, ID, employeeNumber);
       Vector vectorEmployee = new Vector();
    

    //Add Employees Info
   vectorEmployee.addElement(name);
   vectorEmployee.addElement(lastName);
   vectorEmployee.addElement(Salary);
   vectorEmployee.addElement(employeeNumber);
   
   
    }
    
    

    
    
}
