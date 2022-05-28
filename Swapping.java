import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = myobj.nextInt();
        System.out.println("Enter second number: ");
        int num2 = myobj.nextInt();
        System.out.println("Before swap: "+num1+" "+num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: "+num1+" "+num2);
    }
}
