package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // Cannot use child method
        // poly.childMethod();

        ((Child) poly).childMethod();

    }
}
