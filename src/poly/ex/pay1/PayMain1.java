package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        //kakaoPay
        String payOption1 = "kakao";
        int amount1 = 5;
        payService.processPay(payOption1, amount1);
        //naverPay
        String payOption2 = "naver";
        int amount2 = 10;
        payService.processPay(payOption2, amount2);
        //noVailied Pay
        String payOption3 = "bad";
        int amount3 = 15;
        payService.processPay(payOption3, amount3);
    }
}
