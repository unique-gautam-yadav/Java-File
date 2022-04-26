import java.util.Scanner;
class Pro5_Get_Two_Nums{
    public static void main (String args []){
        int a, b, c;
        Scanner s = new Scanner(System.in);
            System.out.println("Enter a Number --->");
            a = s.nextInt();
            System.out.println("Enter a Number --->");
            b = s.nextInt();
        c = a + b;
        System.out.println("The sum of numbers is: "+c);        
        s.close();
    }
}