import java.util.Scanner;
public class SumOfThreeIsZero {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Array length: ");
        int len = obj.nextInt();
        int[] arr = new int[len];
        int n = arr.length;

        System.out.println("Enter array elements:");
        for (int i =0; i<arr.length; i++){
            arr[i] = obj.nextInt();
        }

        boolean found = false;
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (arr[i]+arr[j]+arr[k] == 0)
                    {
                        System.out.print(arr[i]+" + "+arr[j]+" + "+arr[k]+" = "+"0");
                        found = true;
                    }
                }
            }
        }
        if (!found)
            System.out.println("Not exist ");
    }
}
