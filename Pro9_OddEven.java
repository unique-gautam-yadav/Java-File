import java.util.Scanner;
public class Pro9_OddEven {
    void check (int n){
        if(n%2==0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
            System.out.println("Enter a Number --->");
            n = s.nextInt();
        Pro9_OddEven check = new Pro9_OddEven();
        check.check(n);
        s.close();
    }
}
