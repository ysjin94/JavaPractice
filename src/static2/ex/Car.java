package static2.ex;

public class Car {
    private String make;
    private static int qty;

    public Car(String make) {
        this.make = make;
        qty++;
        System.out.println("Purchase Vehicle, Name :" + make );
    }

    public static void showTotalCars(){
        System.out.println("Total Purchased Vehicles : " + qty);
    }
}
