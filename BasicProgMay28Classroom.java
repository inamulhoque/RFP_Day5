import java.util.Scanner;
public class BasicProgMay28Classroom {
    public static void helloName() {
        System.out.println("Hello");
        System.out.println("Inamul Hoque");
    }
    public static void compareNum(int firstInt, int secondInt){
        System.out.println(firstInt+" != "+secondInt+" => "+(firstInt != secondInt));
        System.out.println(firstInt+" < "+secondInt+" => "+(firstInt < secondInt));
        System.out.println(firstInt+" <= "+secondInt+" => "+(firstInt <= secondInt));
    }
    public static void checkInt(int num){
        if (num > 0){
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        BasicProgMay28Classroom obj = new BasicProgMay28Classroom();
        obj.helloName();
        obj.compareNum(40,56);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number to check it's positive, negative or zero: ");
        int num = myObj.nextInt();
        checkInt(num);
    }
}
