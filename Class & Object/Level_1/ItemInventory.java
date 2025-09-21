class ItemInventory {
    int itemCode;
    String itemName;
    double price;

    void display(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        ItemInventory it = new ItemInventory();
        it.itemCode = 1001;
        it.itemName = "Laptop";
        it.price = 50000;
        it.display(2);
    }
}