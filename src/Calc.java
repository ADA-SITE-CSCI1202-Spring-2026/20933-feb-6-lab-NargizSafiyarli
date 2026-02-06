public class Calc {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);

        int number2 = Integer.parseInt(args[1]);

        System.out.println("Sum of these numbers: " + (number1 + number2));

        System.out.println("Subtraction of these numbers: " + (number1 - number2));

        System.out.println("Multiplication of these numbers: " + (number1 * number2));

        if (number2 == 0) {
            System.out.println("Division to 0 is not defined");
        } else {System.out.println("Division of these numbers is: " + (number1 / number2));
            System.out.println("Remainder of these numbers is: " + (number1 % number2));;}


    }
}
