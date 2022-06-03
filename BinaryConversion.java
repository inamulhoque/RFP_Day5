import java.util.Scanner;
public class BinaryConversion {
    public static void toBinary(int num){
        int binary[] = new int[20];
        int i = 0;
        while (num>0) {
            binary[i++] = num % 2;
            num = num / 2;
        }
        for (int c=i-1;c>=0;c--){
            System.out.println(binary[c]);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the decimmal number: ");
        int num = obj.nextInt();
        BinaryConversion.toBinary(num);
    }
}
