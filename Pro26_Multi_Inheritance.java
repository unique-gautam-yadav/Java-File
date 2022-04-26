class GrandParent {
    void Display() {
        System.out.println("This is from Grand Parent Class.");
    }
}

class Parent extends GrandParent {
    void Disp() {
        System.out.println("This is from Parent Class.");
    }
}

class Child extends Parent {
    void Show() {
        System.out.println("This is from Child Class.");
    }
}

public class Pro26_Multi_Inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.Display();
        obj.Disp();
        obj.Show();
    }
}
