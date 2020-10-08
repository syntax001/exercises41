package Task1;

public class Main {
    public static void main(String[] args) {
        Driver myDriver = new Driver("Emil",21);
        Car bentayga = new Car("Bentley","Bentayga",2021,"SUV");
        Car ghost = new Car("Rolls Royce","Ghost",2021,"Sedan");
        bentayga.setDriver(myDriver);
        ghost.setDriver(myDriver);
        System.out.println(bentayga + "\n" + myDriver);
        System.out.println(Car.spacer());
        System.out.println(ghost + "\n" + myDriver);
    }
}
