import java.util.Scanner;

public class Pro16_1D_Array {
    public static void main(String[] args) {
        int a[] = new int [5],i;
        try (Scanner s = new Scanner(System.in)) {
            for (i=0; i<5; i++){
                System.out.println("Enter element "+(i+1)+" of Array");
                a[i] = s.nextInt();
            }
        }
        System.out.println("\n\n\n");
        System.out.println("Printing Elements of array ---->>");
        for (i=0; i<5; i++){
            System.out.print(a[i]+"   ");
        }
    }
    
}
