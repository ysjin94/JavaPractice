package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello World";
        String deco = DecoUtil1.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
