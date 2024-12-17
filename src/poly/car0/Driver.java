package poly.car0;

public class Driver {

    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive(){
        System.out.println("Drive Car.");
        if(k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.stopEngine();
        }else if(model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.stopEngine();
        }else{
            System.out.println("Nothing to drive");
        }
    }
}
