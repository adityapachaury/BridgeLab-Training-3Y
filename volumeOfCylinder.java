import java.util.*;
public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the  cylinder: ");
        float r = sc.nextFloat();

        System.out.println("Enter height of the cylinder: ");
        float h = sc.nextFloat();

        float volume = (r*r)*h*22/7;

        System.out.println("Volume of the cylinder is: "+ volume);
    }
    
}
