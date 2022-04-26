import java.util.Scanner;
class Pro7_Trinagle_Area{
    public static void main(String args []){
        int b,h,a;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Breath --->");
            b = s.nextInt();
            System.out.println("Enter Hieght --->");
            h = s.nextInt();
        }
        a = ( b * h ) / 2;
        System.out.println("Area of triange is: " + a);
    }
}