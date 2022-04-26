import java.util.Scanner;

public class Pro23_Cons_Over {
    Pro23_Cons_Over()
    {
        System.out.println("Welcome!!");
    }
    Pro23_Cons_Over(String s)
    {
        System.out.println("Welcome "+s+"!!");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        System.out.println("Without Prameters -->");
        Pro23_Cons_Over aa = new Pro23_Cons_Over();
        System.out.println("\n\nWith Parameters -->");
        Pro23_Cons_Over ab = new Pro23_Cons_Over(name);
        in.close();
    }    
}
