class Gautam {
    static String name = "Gautam Yadav";

    static void helo() {
        System.out.println("Hellow");
    }
}

public class Pro28_Static {
    public static void main(String[] args) {
        String str = Gautam.name;
        System.out.println("Name = " + str);
        Gautam.helo();
    }
}
