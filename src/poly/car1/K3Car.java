package poly.car1;

public class K3Car implements Car1 {
    @Override
    public void startEngine() {
        System.out.println("K3Car.startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("K3Car.stopEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car.pressAccelerator");
    }
}
