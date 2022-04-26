public class Pro21_Method_Over {
    public static void main(String[] args) {
        int a = 10,b = 20, c= 30;
        double aa = 3.21, ab = 4.22;
        Pro21_Method_Over an = new Pro21_Method_Over();
        an.add(a, b);
        an.add(a, b, c);
        an.add(aa, ab);
    }
    void add(int a, int b)
    {
        System.out.println("Result = "+(a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("Result = " + (a + b + c));
    }
    void add (double aa, double ab)
    {
        System.out.println("Result = " + (aa + ab));
    }
}