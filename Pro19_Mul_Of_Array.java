import java.util.Scanner;

public class Pro19_Mul_Of_Array {
    public static void main(String[] args) {
        int a [][] = new int [3][3], b [][] = new int [3][3], ans [][] = new int [3][3], i,j,k;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Elements of First Array --->");
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                System.out.print("Enter a Number value of a["+(i+1)+(j+1)+"] : ");
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("\n\nEnter Elements of Second Array --->");
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                System.out.print("Enter a Number value of b["+(i+1)+(j+1)+"] : ");
                b[i][j] = s.nextInt();
            }
        }
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                for (k=0; k<3; k++)
                {
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                System.out.print(ans[i][j]+"   ");
            }
            System.out.print("\n");
        }
    }
}
