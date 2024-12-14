package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();
//        Animal[] animalArr = new Animal[]{dog, cat, cow};
        Animal[] animal = {dog, cat, cow, duck};
        for (Animal a : animal) {
            System.out.println("Animal sound test start !");
            a.sound();
            System.out.println("Animal sound test end !");
            System.out.println();
        }
    }
}
