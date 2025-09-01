import java.util.*;
public class powerCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base number: ");
        double base = sc.nextDouble();

        System.out.println("Enter exponential number: ");
        double exp = sc.nextDouble();

        double ans = Math.pow(base, exp);
        System.out.println("Ans is: "+ ans);


        
    }
    
}
