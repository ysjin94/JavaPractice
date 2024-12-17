package poly.ex.pay0;

public class NaverPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("Try to connect to NaverPay");
        System.out.println("Try to pay $" + amount  + " dollars");
        return true;
    }

}
