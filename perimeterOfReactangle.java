import java.util.*;
public class perimeterOfReactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter Width: ");
        int b = sc.nextInt();

        System.out.println("Perimeter is: "+ 2*(l+b));
    }   
}
