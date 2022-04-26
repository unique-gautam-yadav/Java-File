import java.util.Scanner;
class Pro8_Area_Of_Rectangle{
    public double area (double b, double l){
        double a;
        a = b * l;
        return a;
    }
    public void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pro8_Area_Of_Rectangle aa = new Pro8_Area_Of_Rectangle();
        double ar;
        double l;
        double b;
        System.out.println("Enter Length of Rectangle --->");
        b = s.nextDouble();
        System.out.println("Enter Breath of Rectangle --->");
        l = s.nextDouble();
        ar= aa.area(b, l);
        System.out.println("Area of rectagle is: "+ar);
        s.close();
    }
}