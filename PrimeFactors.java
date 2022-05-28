import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = obj.nextInt();
        System.out.println("Prime Factors are:");
        for (int i=2;i<=num;i++){
            int val=num%i;
            if (val==0){
                int factor=i;
                System.out.println(factor);
                num=num/i;
            }
        }
    }
}
