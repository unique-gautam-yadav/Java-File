import java.util.Scanner;
class Pro6_Simple_Interest{
    public static void main(String args []){
        int p,r,t,si;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Price --->");
        p = s.nextInt();
        System.out.println("Enter Rate --->");
        r = s.nextInt();
        System.out.println("Enter Time Period --->");
        t = s.nextInt();
        s.close();
        si = ( p * r * t ) / 100;
        System.out.println("Simple Interest is: "+si);
    }
}