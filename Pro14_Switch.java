import java.util.Scanner;
public class Pro14_Switch {
    public static void main(String[] args) {
        float a, b, result=0;
        int c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        a = s.nextFloat();
        System.out.println("Enter second Number: ");
        b = s.nextFloat();
        System.out.println("Select Your Choice -->>");
        System.out.println("Press 1 for Add.");
        System.out.println("Press 2 for Sub.");
        System.out.println("Press 3 for Mul.");
        System.out.println("Press 4 for Div.");
        c = s.nextInt();
        s.close();
        switch (c){
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                System.out.println("Invalid Choise, please try again.");
        }
        System.out.println("The result is: "+result);
    }
}
