
package Domain;

public class Janitor extends Employee {
    //Asign Atributes
    private boolean qualified;
    private int extraHours;
    
    public Janitor(){
        //Start Variables
        super();
        this.extraHours = 0;
        this.qualified = false;
    }

    public Janitor(boolean qualified, int extraHours, String name, String lastName, double salary, String ID, int employeeNumber) {
        super(name, lastName, salary, ID, employeeNumber);
        this.qualified = qualified;
        this.extraHours = extraHours;
    }

    public boolean isQualified() {
        return qualified;
    }

    public void setQualified(boolean qualified) {
        this.qualified = qualified;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    @Override
    public void calculateSalary() {
        double temp=120 +(120*0.25)*extraHours;
        if(qualified){
            temp = 120 +(120*0.25)*extraHours+(120*0.0395);  
        }  
    } 
}
