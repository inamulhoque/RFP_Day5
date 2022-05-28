import java.util.Scanner;
public class SumOfDigitOfNumber {
    public static void sumOfTheDigit (int input) {
        int rem;
        int sum = 0;
        while (input > 0) {
            rem = input % 10;
            sum = sum + rem;
            input = input / 10;
        }
        System.out.println("Sum of digits is = " + sum);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = obj.nextInt();
        sumOfTheDigit(input);
    }
}
