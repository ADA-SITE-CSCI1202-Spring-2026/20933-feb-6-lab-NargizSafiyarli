import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        if (x < 0) {
            System.out.println(x + " is negative number");
        } else if (x > 0) {
            System.out.println(x + " is positive number");
        } else System.out.println(x + " is neutral number");


    }
}
