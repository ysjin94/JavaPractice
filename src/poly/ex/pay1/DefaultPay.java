package poly.ex.pay1;

public class DefaultPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("Not found option.");
        return false;
    }
}
