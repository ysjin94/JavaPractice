package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal[] animal = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (Animal a : animal) {
            soundAnimal(a);
        }
    }

    private static void soundAnimal(Animal a) {
        System.out.println("Animal sound test start !");
        a.sound();
        System.out.println("Animal sound test end !");
        System.out.println();
    }
}
