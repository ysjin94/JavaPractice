package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod(){
        System.out.println("publicMethod");
    }

    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    void defaultMethod(){
        System.out.println("defaultMethod");
    }

    private void privateMethod(){
        System.out.println("privateMethod");
    }

    public void printParent(){
        System.out.println("========printParent===========");
        System.out.println("publicMethod: " + publicValue);
        System.out.println("protectedMethod: " + protectedValue);
        System.out.println("defaultMethod: " + defaultValue);
        System.out.println("privateMethod: " + privateValue);

        defaultMethod();
        protectedMethod();
    }

}
