
// Library Book System with borrow method
class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", 300);
        b1.displayBook();
        b1.borrowBook();
        b1.displayBook();
    }
}
