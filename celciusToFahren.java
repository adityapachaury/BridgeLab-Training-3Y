import java.util.*;
public class celciusToFahren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temprature in celcius");
        float cel = sc.nextFloat();

        float fahren = (cel*9/5)+32;

        System.out.println("Temp. in fahrenheit is: "+ fahren);
    }
    
}
