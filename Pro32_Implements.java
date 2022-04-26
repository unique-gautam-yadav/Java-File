interface Gautam {
    void name();
}

public class Pro32_Implements implements Gautam {
    public void name() {
        System.out.println("Gautam Yadav");
    }

    public static void main(String[] args) {
        Pro32_Implements obj = new Pro32_Implements();
        obj.name();
    }
}
