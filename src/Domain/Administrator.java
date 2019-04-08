
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

    @Override
    public void calculateSalary() {
        double temp =0;
        if(category){
            temp =250;
            if(qualify)
                temp = (250*0.0395)+ 250; 
        }
        else{
            temp =(250+(250*0.20));
            if(qualify)
                temp = 250+(250*0.20)+(250*0.0395);
        }
    }
}
