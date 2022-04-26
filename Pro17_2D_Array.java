import java.util.Scanner;

public class Pro17_2D_Array {
    public static void main(String[] args) {
        int arr [][] = new int [3][3], i, j;
        Scanner s = new Scanner(System.in);
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                System.out.println("Enter value of arr["+(i+1)+(j+1)+"].");
                arr [i][j]= s.nextInt();
            }
        }
        System.out.println("\n\n");
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                System.out.print(arr[i][j]+"   ");
            }
        }
    }
}
