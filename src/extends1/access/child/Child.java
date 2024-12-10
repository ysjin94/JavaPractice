package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; // Inheritance
        // defaultValue = 1  compile error
        // private = 1      compile error

        publicMethod();
        protectedMethod();
        //defaultMethod() compile error
        //privateMethod() compile error

        printParent();
    }
}
