package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before call method: a = " + a);
        changePrimitive(a);
        System.out.println("After call method: a = " + a);
    }
    static void changePrimitive(int x) {
        x = 20;
    }
}
