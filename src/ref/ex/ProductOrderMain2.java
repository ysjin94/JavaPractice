package ref.ex;

import ref.Student;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        /**
         * 상품명: 두부, 가격: 2000, 수량: 2
         * 상품명: 김치, 가격: 5000, 수량: 1
         * 상품명: 콜라, 가격: 1500, 수량: 2
         * 총 결제 금액: 12000
         */
        ProductOrder item1 = new ProductOrder("tofu", 2000, 2);
        ProductOrder item2 = new ProductOrder("kimchi", 5000, 1);
        ProductOrder item3 = new ProductOrder("coca-cola", 1500, 2);

        ProductOrder[] itemList = new ProductOrder[]{item1, item2, item3};

        int totalPrice = 0;
        //ITER short_key
        for (ProductOrder item : itemList) {
//            printItem(item);
            item.printItem();
            totalPrice += item.getTotalPrice();
        }
        System.out.println("Total price : " + totalPrice);

    }
//    static void printItem(ProductOrder item) {
//        System.out.println("Item : " + item.getProductName()
//                + " Price : " + item.getPrice()
//                + " Qty : " + item.getQuantity());
//    }

}
