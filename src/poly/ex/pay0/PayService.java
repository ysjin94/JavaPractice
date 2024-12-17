package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("Try to pay: option=" + option + ", amount=" +
                amount);

        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("Not found option: " + option);
            result = false;
        }


        if (result) {
            System.out.println("Success !");
        } else {
            System.out.println("Failure !");
        }
    }

}
