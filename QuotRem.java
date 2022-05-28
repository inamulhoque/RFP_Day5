import java.util.Scanner;
public class QuotRem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Divident: ");
        int divident = obj.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = obj.nextInt();
        System.out.println("Quotient is: "+(divident/divisor));
        System.out.print("Remainder is: "+(divident%divisor));
    }
}
