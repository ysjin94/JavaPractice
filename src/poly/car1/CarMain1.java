package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //Choose Vehicle(k3)
        K3Car k3Car = new K3Car();
        driver.setCar1(k3Car);
        driver.drive();

        //Choose Vehicle(Model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar1(model3Car);
        driver.drive();

        //Choose Vehicle(NewCar)
        NewCar newCar = new NewCar();
        driver.setCar1(newCar);
        driver.drive();

    }
}
