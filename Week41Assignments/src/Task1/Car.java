package Task1;

public class Car {
    private String carMake;
    private String carModel;
    private int modelYear;
    private String carType;
    private Driver driver;

    Car(String tmpCarMake, String tmpCarModel, int tmpModelYear, String tmpCarType) {
        carMake = tmpCarMake;
        carModel = tmpCarModel;
        modelYear = tmpModelYear;
        carType = tmpCarType;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver tmpDriver) {
        driver = tmpDriver;
    }

    public static String spacer() {
        return "\n----------------------\n";
    }

    public String toString() {
        return "Car Brand: " + carMake + "\nModel: " + carModel + "\nModel Year: " + modelYear + "\nCar Type: " + carType;
    }
}
