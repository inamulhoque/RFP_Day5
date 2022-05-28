import java.util.Scanner;
public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        String alpha = obj.next();
        String str = alpha.toLowerCase();
        if (str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u")){
            System.out.println("'"+alpha+"'"+" is a vowel.");
        } else {
            System.out.println("'"+alpha+"'"+" is a consonent.");
        }
    }
}
