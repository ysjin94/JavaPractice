package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        System.out.println("Animal sound test start !");
        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);
        System.out.println("Animal sound test end !");
        System.out.println();

        System.out.println("Animal fly test start !");
        flyAnimal(bird);
        flyAnimal(chicken);
        System.out.println("Animal fly test end !");
        System.out.println();

    }

    private static void soundAnimal(AbstractAnimal a) {
        a.sound();
    }

    private static void flyAnimal(Fly fly) {
        fly.fly();
    }

}
