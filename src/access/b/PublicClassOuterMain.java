package access.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // canot access Default class
//        DefaultClass1 = new DefaultClass1();
//        DefaultClass2 = new DefaultClass2();
    }
}
