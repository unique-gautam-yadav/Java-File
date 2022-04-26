public class Pro27_Riding {
    public static void main(String[] args) {
        Class1 n = new Class2();
        n.running();
        n.hello();
    }
}

class Class1 {
    void running() {
        System.out.println("This is Running from Class 1 which is Parent Class");
    }

    void hello() {
        System.out.println("Hello World!!");
    }
}

class Class2 extends Class1 {
    void running() {
        System.out.println("This is Running from class 2 which is Child Class");
    }

    void me() {
        System.out.println("My name is Gautam Yadav");
    }
}