import java.util.Scanner;
public class Pro18_Add_Of_Array {
    public static void main(String[] args) {
        int a[][] = new int [10][10], b[][] = new int [10][10],c[][] = new int [10][10],i,j,col,row;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num of columns -> ");
        col = s.nextInt();
        System.out.print("Enter num of rows -> ");
        row = s.nextInt();
        for (i=0; i<col; i++)
        {
            for (j=0; j<row; j++)
            {
                System.out.print("Enter value of a["+(i+1)+(j+1)+"] -> ");
                a[i][j] = s.nextInt();
            }
        }
        System.out.print("\n\n");
        for (i=0; i<col; i++)
        {
            for (j=0; j<row; j++)
            {
                System.out.print("Enter value of b["+(i+1)+(j+1)+"] -> ");
                b[i][j] = s.nextInt();
                c[i][j] = a[i][j] + b[i][j];

            }
        }
        for (i=0; i<col; i++)
        {
            for (j=0; j<row; j++)
            {
                System.out.print(c[i][j]+"   ");
            }
            System.out.print("\n");
        }
    }
    
}
