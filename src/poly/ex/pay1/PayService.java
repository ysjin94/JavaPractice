package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("Try to pay: option=" + option + ", amount=" +
                amount);

        Pay pay = PayStore.findPay(option);
        result = pay.pay(amount);

        if (result) {
            System.out.println("Success !");
        } else {
            System.out.println("Failure !");
        }
    }

}
