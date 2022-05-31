import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter row size:");
        int m = obj.nextInt();
        System.out.println("Enter column size:");
        int n = obj.nextInt();
        String arr[][] = new String[m][n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j]=obj.nextLine();
            }
        }

        for (int i = 0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print("arr["+i+"]["+j+"]="+arr[i][j]);
                System.out.println("\t");
            }
            System.out.println(" ");
        }
    }
}
