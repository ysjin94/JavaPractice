package poly.car1;

public class Driver {

    private Car1 car1;

    public void setCar1(Car1 car1) {
        System.out.println("Setup Vehicle : " + car1);
        this.car1 = car1;
    }

    public void drive(){
        System.out.println("Start driving.");
        car1.startEngine();
        car1.pressAccelerator();
        car1.stopEngine();
    }
}
