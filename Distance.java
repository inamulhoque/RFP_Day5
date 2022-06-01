import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scan.nextInt();
        System.out.println("Enter y: ");
        int y = scan.nextInt();
        double distance = (int) (Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
        System.out.println("Distance from ("+x+","+y+") to origin (0,0) is: "+distance);
    }
}
