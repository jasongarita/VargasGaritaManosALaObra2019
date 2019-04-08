
package Domain;

public class HeavyMachine extends Driver {

    private boolean trolley;
    private boolean cranes;
    private boolean liftTruck;

    public HeavyMachine() {
        super();
        this.trolley = false;
        this.cranes = false;
        this.liftTruck = false;
    }

    public HeavyMachine(boolean trolley, boolean donor, String kindLicense, boolean schedule, int hours, boolean qualified, String name, String lastName, double salary, String ID, int employeeNumber) {
        super(donor, kindLicense, schedule, hours, qualified, name, lastName, salary, ID, employeeNumber);
        this.trolley = trolley;
    }

    public boolean isTrolley() {
        return trolley;
    }

    public void setTrolley(boolean trolley) {
        this.trolley = trolley;
    }

    public boolean isCranes() {
        return cranes;
    }

    public void setCranes(boolean cranes) {
        this.cranes = cranes;
    }

    public boolean isLiftTruck() {
        return liftTruck;
    }

    public void setLiftTruck(boolean liftTruck) {
        this.liftTruck = liftTruck;
    }

    @Override
    public void calculateSalary() {
        double temp = 0;
        if (trolley) {
            temp = (getHours() * 16);
            if (qualified) {
                temp = (getHours() * 16)+ ((getHours() * 16) * 0.0395);
            }
            if (schedule) {
                temp = (getHours() * 24);
                if (qualified) {
                    temp = (getHours() * 24)+ ((getHours() * 24) * 0.0395);
                }
            }
        }
        if (cranes) {
            temp = (getHours() * 18);
            if (qualified) {
                temp = (getHours() * 18)+ ((getHours() * 18) * 0.0395);
            }
            if (schedule) {
                temp = (getHours() * 36);
                if (qualified) {
                    temp = (getHours() * 36)+ ((getHours() * 36) * 0.0395);
                }
            }
        }
        if (liftTruck) {
            temp = (getHours() * 24);
            if (qualified) {
                temp = (getHours() * 24)+ ((getHours() * 24) * 0.0395);
            }
            if (schedule) {
                temp = (getHours() * 48);
                if (qualified) {
                    temp = (getHours() * 48)+ ((getHours() * 48) * 0.0395);
                }
            }
        }
    }
}
