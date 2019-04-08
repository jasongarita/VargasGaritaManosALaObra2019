
package Domain;

public class Administrator extends Employee{
    //Asign Atributes
    private boolean category;
    private boolean qualify;
    
    public Administrator(){
        //Start Variables
        super();
        this.category = false;
        this.qualify = false;
    }

    public Administrator(boolean category, boolean qualify) {
        this.category = category;
        this.qualify = qualify;
    }

    public Administrator(boolean category, boolean qualify, String name, String lastName, double salary, String ID, int employeeNumber) {
        super(name, lastName, salary, ID, employeeNumber);
        this.category = category;
        this.qualify = qualify;
    }

    public boolean isCategory() {
        return category;
    }

    public void setCategory(boolean category) {
        this.category = category;
    }

    public boolean isQualify() {
        return qualify;
    }

    public void setQualify(boolean qualify) {
        this.qualify = qualify;
    }

//Salary Manager Calculator
    public double estimateSalary() {
        double temp = this.getSalary();
        
        if (category == true) {
            return 250;

        }
        if (category == false) {
            temp += 250 * 0.2;
           this.setSalary(temp);
        }
        return temp;
    }
    }

