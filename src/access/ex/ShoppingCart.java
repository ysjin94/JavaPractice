package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public ShoppingCart(){
        itemCount = 0;
    }
    public void addItem(Item item) {
        if(itemCount == items.length){
            System.out.println("Too many items.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems(){
        if(itemCount == 0){
            System.out.println("No items in shopping cart");
            return;
        }

        System.out.println("Items in shopping cart:");
        for (Item item : items) {
            if(item != null) {
                System.out.println("Item :" + item.getName() + ", " + "price :" + item.totalPrice());
            }
        }

        System.out.println("Total Ammount : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.totalPrice();
        }
        return totalPrice;
    }
}
