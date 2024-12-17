package poly.ex.pay1;

public class KakaoPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("Try to connect to KakaoPay");
        System.out.println("Try to pay $" + amount  + " dollars");
        return true;
    }
}
