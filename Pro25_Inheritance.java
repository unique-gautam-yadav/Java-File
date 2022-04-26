class Parent {

    void Display() {
        System.out.println("This is From Parent class");
    }
}

class Child extends Parent {
    void Show() {
        System.out.println("This is from child class");
    }
}

public class Pro25_Inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.Display();
        obj.Show();
    }
}
