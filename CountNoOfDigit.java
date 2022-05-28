import java.util.Scanner;
public class CountNoOfDigit {
    public static void main(String[] args) {
        int count =0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the positive number less than ten billion:");
        int num = obj.nextInt();
        while (num!=0){
            num = num/10;
            ++count;
        }
        System.out.println(count+" number of digits.");
    }
}
