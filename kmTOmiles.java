import java.util.Scanner;

public class kmTOmiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float km = sc.nextFloat();

        double miles = km*(0.621371);

        System.out.println("Distance in miles is: "+ miles);

    }
    
}
