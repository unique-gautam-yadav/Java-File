interface In1 {
    void M1();
}

interface In2 extends In1 {
    void M2();
}

public class Pro33_Interface_Inheritance implements In2 {
    public void M1() {
        System.out.println("Parent Interface");
    }

    public void M2() {
        System.out.println("Child Interface");
    }

    public static void main(String[] args) {
        Pro33_Interface_Inheritance obj = new Pro33_Interface_Inheritance();
        obj.M1();
        obj.M2();
    }
}
