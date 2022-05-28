import java.util.Scanner;
public class LeapYear {
    public static void isLeapYear(int year){
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year+" is a leap year.");
                }
            } else {
                System.out.println(year+" is a leap year.");
            }
        } else {
            System.out.println(year+" is not a leap year.");
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter year with 4 digits: ");
        int year = myObj.nextInt();
        if (year>1000 || year<9999){
            LeapYear.isLeapYear(year);
        } else {
            System.out.println("Enter 4 digit as previously directed.");
        }
    }
}
