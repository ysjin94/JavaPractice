package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final - Constructor init
        System.out.println("Constructor Init");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final - Field Init
        System.out.println("Field Init");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //Constant
        System.out.println("Constant");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
