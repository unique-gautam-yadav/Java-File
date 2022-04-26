import java.util.Scanner;
public class Pro12_Palindrome {
    public static void main(String args []) {
        int n;
        System.out.println("Enter A Number --->");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        Palindrome c = new Palindrome();
        if (c.pd(n) == true){
            System.out.println("Number is Palindrome.");
        }
        else{
            System.out.println("Number is not Palindrome.");
        }
        s.close();
    }
}
class Palindrome{
    boolean pd (int n)
    {
        int i,r,sum;
        boolean res;
        r = 0;
        sum = 0;
        for (i=n; i>0; i/=10){
            r = i % 10;
            sum=(sum*10)+r;
        }
        if (sum == n)
        res = true;
        else
        res = false;
        return res;
    }
}
