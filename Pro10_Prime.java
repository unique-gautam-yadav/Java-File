import java.util.Scanner;
class Pro10_Prime{
    public static void main(String args []) {
        int n;
        Prime c = new Prime();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number --->");
        n = s.nextInt();
        if (c.check(n) == false)
        System.out.print("The num is Prime.");
        else
        System.out.print("The num is not Prime.");      
        s.close();
    }
}
class Prime{
    boolean check(int n){
        int i;
        boolean f=false;
        for (i=2; i<n/2; i++)
        {
            if (n%i!=0)
            {
                f=false;
            }
            else
            {
                f=true;
                break;
            }
        }
        return f;
    }
}