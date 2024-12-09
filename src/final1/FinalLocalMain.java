package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final local variable
        final int data1;
        data1 = 10;

        //data2 = 20 compile error

        //final local variable2
        final int data2 = 10;
        //data2 = 20 compile error
    }
    static void method(final int param){
        //param = 20; compile error
    }
}
