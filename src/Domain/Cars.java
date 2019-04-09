package Domain;

public class Cars extends Driver {
     private String Brand;
    private String Model;
    private String Year;
    private String Plate;
    private boolean Donor;
    
    public Cars(String Brand, String Model, String Year, String Plate, boolean cars) {
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
        this.Plate = Plate;
        this.cars = cars;
    }

    public Cars(String Brand, String Model, String Year, String Plate, boolean cars, boolean donor, String kindLicense, boolean schedule, int hours, boolean qualified) {
        super(donor, kindLicense, schedule, hours, qualified);
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
        this.Plate = Plate;
        this.cars = cars;
    }

    public Cars(String Brand, String Model, String Year, String Plate, boolean cars, boolean donor, String kindLicense, boolean schedule, int hours, boolean qualified, String name, String lastName, double salary, String ID, int employeeNumber) {
        super(donor, kindLicense, schedule, hours, qualified, name, lastName, salary, ID, employeeNumber);
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
        this.Plate = Plate;
        this.cars = cars;
    }


    private boolean cars;

    public Cars() {
        super();
        this.cars = false;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getPlate() {
        return Plate;
    }

    public void setPlate(String Plate) {
        this.Plate = Plate;
    }

    public boolean isDonor() {
        return Donor;
    }

    public void setDonor(boolean Donor) {
        this.Donor = Donor;
    }

    public boolean isCars() {
        return cars;
    }

    public void setCars(boolean cars) {
        this.cars = cars;
    }

  

    

    @Override
    public void calculateSalary() {
        double temp = 0;

        if (cars) {
            temp = (getHours() * 10);
            if (qualified) {
                temp = (getHours() * 10) + ((getHours() * 10) * 0.0395);
            }
            if (schedule) {
                temp = (getHours() * 20);
                if (qualified) {
                    temp = (getHours() * 20)+ ((getHours() * 20) * 0.0395);
                }
            }
        }
    }

    public int size() {
        return this.getBrand().length() 
                + this.getModel().length()
                    + this.getYear().length()
                        +this.getPlate().length();
    }

}

