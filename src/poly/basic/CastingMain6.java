package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        System.out.println();

        Parent parent2 = new Child();
        call(parent2);
    }

    // Above Java Version 16
    private static void call(Parent p) {
        p.parentMethod();
        if(p instanceof Child child) {
            System.out.println("This is Child instance.");
            child.childMethod();
        }else{
            System.out.println("This is not Child instance.");
        }

    }
}
