class MobilePhoneInfo {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhoneInfo m = new MobilePhoneInfo();
        m.brand = "Samsung";
        m.model = "Galaxy S23";
        m.price = 75000;
        m.display();
    }
}