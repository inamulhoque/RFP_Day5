import java.util.Scanner;
public class SpecialQno28 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        float num = obj.nextFloat();
        float n = Math.abs(num);

        if (num == 0){
            System.out.println("Zero");
        } else if (num < 0) {
            System.out.println("Negative");

        } else {
            System.out.println("Positive");
        }
            if (n < 1) {
                System.out.println("Small");
            } else if (n > 1000000) {
                System.out.println("Large");
            }
        }
    }