package poly.ex3;

import poly.ex3.AbstractAnimal;

public class AbstractMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);


    }

    private static void soundAnimal(AbstractAnimal a) {
        System.out.println("Animal sound test start !");
        a.sound();
        System.out.println("Animal sound test end !");
        System.out.println();
    }

}
