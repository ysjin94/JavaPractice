package poly.ex5;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("Cat sound.");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving.");
    }
}
