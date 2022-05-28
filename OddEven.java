import java.util.Scanner;
public class OddEven {
    public static void oddOReven(int num){
        int result = num%2;
        if (result == 0){
            System.out.println(num+" is even.");
        } else {
            System.out.println(num+" is odd.");
        }
    }
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = newObj.nextInt();
        oddOReven(num);
    }
}
