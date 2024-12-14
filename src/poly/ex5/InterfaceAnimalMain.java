package poly.ex5;


public class InterfaceAnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("Animal sound test start !");
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        System.out.println("Animal sound test end !");
        System.out.println();

        System.out.println("Animal move test start !");
        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
        System.out.println("Animal move test end !");
        System.out.println();
    }

    private static void soundAnimal(InterfaceAnimal a) {
        a.sound();
    }

    private static void moveAnimal(InterfaceAnimal a) {
        a.move();
    }
}
