import java.util.Scanner;

public class Pro20_Choise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choise;
        double l,b,r;
        System.out.println("Press 1 for Rectange -->");
        System.out.println("Press 2 for Square -->");
        System.out.println("Press 3 for Circle -->");
        choise = s.nextInt();
        switch (choise) {
            case 1:
                System.out.print("Enter L and B ");
                l = s.nextDouble();
                b = s.nextDouble();
                System.out.print("Area of Rectangle = "+(l*b));
                break;
            case 2:
                System.out.print("Enter length of side ");
                l = s.nextDouble();
                System.out.print("Area of Square = "+(l*l));
                break;
            case 3:
                System.out.print("Enter Radius of Circle ");        
                r = s.nextDouble();
                System.out.print("Area of Circle = "+(2*3.14*r));
                break;
            default:
                System.out.print("Please!! Enter a valid choise");
                break;
        }
        s.close();
    }
}