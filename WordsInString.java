import java.util.Scanner;
public class WordsInString {
    public static void getWord(String str){
        int count =1;
        for(int i=0;i<str.length()-1;i++){
            if (str.charAt(i)==' ' && str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your String:");
        String input = myObj.nextLine();
        getWord(input);
    }
}
