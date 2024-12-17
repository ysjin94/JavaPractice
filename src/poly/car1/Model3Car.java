package poly.car1;

public class Model3Car implements Car1 {

    @Override
    public void startEngine(){
        System.out.println("Model3Car.startEngine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Model3Car.stopEngine");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("Model3Car.pressAccelerator");
    }
}
