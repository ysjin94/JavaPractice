package ref.ex;

import ref.ex.ProductOrder;

import java.util.Iterator;
import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many orders do you want? : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        int cnt = 0;
        for (ProductOrder order : orders) {
            System.out.println( cnt+1 + ". Enter Item Information.");
            System.out.print("Enter product name : ");
            String itemName = scanner.next();
            scanner.nextLine();

            System.out.print("Enter price : ");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter quantity : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            order = new ProductOrder(itemName, price, quantity);

            orders[cnt] = order;
        }
        scanner.close();

        int totalPrice = 0;
        for (ProductOrder order : orders) {
            order.printItem();
            totalPrice += order.getPrice();
        }
        System.out.println("Total price : " + totalPrice);
    }

//    static void printItem(ProductOrder item) {
//        System.out.println("Item : " + item.getProductName()
//                + ", Price : " + item.getPrice()
//                + ", Qty : " + item.getQuantity());
//    }

}
