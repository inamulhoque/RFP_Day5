import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        int count =1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter how many times to flip coin");
        int input = obj.nextInt();

        while (count<=input) {
            int random = (int) (Math.floor(Math.random() * 10) % 2 + 1);
            if (random == 1) {
                System.out.println("Tail");
                tail++;
                count++;
            } else {
                System.out.println("Head");
                head++;
                count++;
            }
        }

        System.out.println("Head: "+head);
        System.out.println("Tail: "+tail);

        float headpercent = ((float)head/input)*100;
        System.out.println("Percentage of occuring head: "+headpercent);
        float tailpercent = ((float)tail/input)*100;
        System.out.println("Percentage of occuring tail: "+tailpercent);
    }
}
