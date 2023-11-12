abstract class Vehicle {
    //variables
    String name,brand;
    int model;
    boolean isAvailable;

    //Constructors
    Vehicle(){}
    Vehicle(String nameVeh,String brandVeh,int modelVeh,boolean isAvailable){
        this.name = nameVeh;
        this.brand = brandVeh;
        this.model = modelVeh;
        this.isAvailable = isAvailable;
    }
    abstract void getQuote();
    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    //Print Method
    public void printDetails(){
        System.out.println("Vehicle Name: " + name);
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle is Available: " + isAvailable);
    }

}
