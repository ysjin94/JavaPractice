package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public
        data.publicField = 1;
        data.publicMethod();

        //default x different Package
//        data.defaultField = 2;
//        data.defaultMethod();

        //private x
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess();

    }
}
