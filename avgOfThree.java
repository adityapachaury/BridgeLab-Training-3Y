import java.util.Scanner;

public class avgOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int avg = (x+y+z)/3;
        System.out.println("Average is: "+ avg);
    }
    
}
