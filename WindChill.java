import java.util.Scanner;
public class WindChill {
    public static void windChill(double t, double v){
        if (t>50 || v>120 || v<3){
            System.out.println("Invalid input. Try Temperature<50 °F and Wind speed between 3 to 120 Mph.");
        } else {
            double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("The Effective Temperature is: " + w);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit:");
        double t = obj.nextDouble();
        System.out.println("Enter Wind speed:");
        double v = obj.nextDouble();
        windChill(t,v);
    }
}
