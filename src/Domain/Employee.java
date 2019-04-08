
package Domain;

public class Employee {

    //Asign General Atributes
    private String name;
    private String lastName;
    private double salary;
    private String ID;
    private int employeeNumber;
    
    public Employee() {
    //Start Variable     
        
    this.name = " ";
    this.lastName = " ";
    this.salary = 0;
    this.ID = " ";
    this.employeeNumber = 0;
}
    //Constructor
    public Employee(String name, String lastName, double salary, String ID, int employeeNumber) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.ID = ID;
        this.employeeNumber = employeeNumber;
    }
    //Setters & Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    
    //Calculate Salary
    public void calculateSalary(){
        
    }    
    
}
