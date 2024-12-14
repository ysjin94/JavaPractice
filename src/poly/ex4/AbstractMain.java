package poly.ex4;

public class AbstractMain {
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

    private static void soundAnimal(AbstractAnimal a) {
        a.sound();
    }

    private static void moveAnimal(AbstractAnimal a) {
        a.move();
    }
}
