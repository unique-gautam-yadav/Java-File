 import java.util.Scanner;

public class Pro22_Con {
    Pro22_Con()
    {
        System.out.println("Hello, There");
    }
    Pro22_Con(String name)
    {
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) {
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your name -->");
        name = s.nextLine();
        Pro22_Con n = new Pro22_Con();
        Pro22_Con n1 = new Pro22_Con(name);
        s.close();
    }    
}
