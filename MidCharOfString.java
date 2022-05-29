import java.util.Scanner;
public class MidCharOfString {
    public static void middleChar(String str){
        int length = str.length();
        int middle = length/2;
        System.out.println(str.charAt(middle));
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = obj.nextLine();
        middleChar(str);
    }
}
