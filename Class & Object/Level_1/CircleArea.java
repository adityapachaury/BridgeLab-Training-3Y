class CircleArea {
    double radius;

    void display() {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        CircleArea c = new CircleArea();
        c.radius = 7;
        c.display();
    }
}