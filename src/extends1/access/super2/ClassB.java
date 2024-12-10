package extends1.access.super2;

public class ClassB extends ClassA {

    public ClassB(int a){
//        super(); // Skip able if default Constructor exists
        this(10,20);
        System.out.println("ClassB Constructor =" + a);
    }

    public ClassB(int a, int b){
        super(); // Skip able if default Constructor exists
        System.out.println("ClassB Constructor a=" + a + " b=" + b);
    }
}
