import java.util.Scanner;
public class Pro11_Add_Digits {
    public static void main(String args []) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number -- ");
        int n = s.nextInt();
        Cal c = new Cal();
        System.out.println("Sum of the number is="+c.adddig(n));
        s.close();
    }
}
class Cal{
    int adddig (int n){
        int i,r,sum;
        r = 0;
        sum = 0;
        for (i=n; i>0; i/=10){
            r = i % 10;
            sum+=r;
        }
        return sum;
    }
}
