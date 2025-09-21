
// Circle class with constructor chaining
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();

        Circle c2 = new Circle(5.5);
        c2.display();
    }
}
