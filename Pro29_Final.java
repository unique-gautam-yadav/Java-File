final class Gautam {
    void hii() {
        System.out.println("Hello");
    }
}

class Yadav {

    final void disp() {
        System.out.println("Hello");
    }
}

class First extends Gautam {
    void hello() {
        System.out.println("Hii");
    }
}

class Second extends Yadav {
    void disp() {
        System.out.println("Gautam Yadav");
    }
}

public class Pro29_Final {
    public static void main(String[] args) {
        final String name = "Gautam";
        name = "Gautam Yadav";
    }
}
