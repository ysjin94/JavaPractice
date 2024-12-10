package extends1.access.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); // Default Constructor does not exists.
        System.out.println("ClassC Constructor");
    }
}
