import java.util.Scanner;
public class SpecialQno31 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = obj.nextInt();
        System.out.println("Enter second number:");
        int n2 = obj.nextInt();
        System.out.println("Enter third number:");
        int n3 = obj.nextInt();
        if (n1<n2&&n2<n3){
            System.out.println("Increasing order");
        } else if (n1>n2&&n2>n3){
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }
}
