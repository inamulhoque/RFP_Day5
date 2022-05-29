import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = obj.nextLine();
        vowelCount(str);
    }
    public static int vowelCount(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
