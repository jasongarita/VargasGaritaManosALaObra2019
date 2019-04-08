
package Domain;

public abstract class Driver extends Employee{
    //Asign Variables
    
    boolean donor;
    String kindLicense;
    boolean schedule;
    int hours;
    boolean qualified;
    
    public Driver(){
        super();
        this.donor = false;
        this.hours = 0;
        this.kindLicense = "";
        this.schedule = false;
        this.qualified = false;
    }

    public Driver(boolean donor, String kindLicense, boolean schedule, int hours, boolean qualified) {
        this.donor = donor;
        this.kindLicense = kindLicense;
        this.schedule = schedule;
        this.hours = hours;
        this.qualified = qualified;
    }

    public Driver(boolean donor, String kindLicense, boolean schedule, int hours, boolean qualified, String name, String lastName, double salary, String ID, int employeeNumber) {
        super(name, lastName, salary, ID, employeeNumber);
        this.donor = donor;
        this.kindLicense = kindLicense;
        this.schedule = schedule;
        this.hours = hours;
        this.qualified = qualified;
    }

    public boolean isDonor() {
        return donor;
    }

    public void setDonor(boolean donor) {
        this.donor = donor;
    }

    public String getKindLicense() {
        return kindLicense;
    }

    public void setKindLicense(String kindLicense) {
        this.kindLicense = kindLicense;
    }

    public boolean isSchedule() {
        return schedule;
    }

    public void setSchedule(boolean schedule) {
        this.schedule = schedule;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isQualified() {
        return qualified;
    }

    public void setQualified(boolean qualified) {
        this.qualified = qualified;
    }

    @Override
    public void calculateSalary(){
        
    }
}
