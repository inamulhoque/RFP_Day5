import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter the Harmonic value N: ");
        int n = myobj.nextInt();
        if (n==0){
            System.out.println("Enter a positive number");
        } else {
            for (int i=1; i<=n;i++) {
                System.out.println(1+"/"+i);
            }
        }
    }
}
