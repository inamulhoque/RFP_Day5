import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Quadratic equation: ax^2+bx+c=0");
        System.out.println("Enter a:");
        float a = obj.nextFloat();
        System.out.println("Enter b:");
        float b = obj.nextFloat();
        System.out.println("Enter c:");
        float c = obj.nextFloat();

        float delta = (float) (Math.pow(b,2) - 4*a*c);
        float root1 = (float) ((-b + Math.sqrt(delta))/2*a);
        float root2 = (float) ((-b - Math.sqrt(delta))/2*a);
        System.out.println("Two roots are: "+root1+" "+root2);
    }
}
