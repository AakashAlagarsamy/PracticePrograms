package TCS_Sem1.VehicleProblem;

class Vehicle {

    private String name;
    private String fuelType;
    private int mileage;
    private double price;

    public Vehicle() {
    }

    public Vehicle(String name, String fuelType, int mileage, double price) {
        this.name = name;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + fuelType + " " + mileage + " " + price;
    }
}
