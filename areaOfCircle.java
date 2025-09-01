import java.util.*;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        float r = sc.nextFloat();

        System.out.println("Area of the circle is: "+ (r*r)*22/7);
    }
}
