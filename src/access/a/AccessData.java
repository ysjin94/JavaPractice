package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("publicMethod");
    }

    void defaultMethod(){
        System.out.println("defaultMethod");
    }

    private void privateMethod(){
        System.out.println("privateMethod");
    }

    public void innerAccess(){
        System.out.println("innerAccess");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
