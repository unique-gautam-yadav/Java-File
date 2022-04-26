abstract class A {
    abstract void m1();

    void m2() {
        System.out.println("Hello");
    }
}

public class Pro30_Abstruct extends A {
    @Override
    void m1() {
        System.out.println("Gautam Yadav");
    }

    public static void main(String[] args) {
        Pro30_Abstruct obj = new Pro30_Abstruct();
        obj.m1();
        obj.m2();
    }
}
