package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        //A has been chaged
        a = 20;
        System.out.println("\na = 20");
        System.out.println(a);
        System.out.println(b);

        //B has been chaged

        b = 30;
        System.out.println("\nb = 30");
        System.out.println(a);
        System.out.println(b);

    }
}
