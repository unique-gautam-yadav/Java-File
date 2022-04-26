import java.util.Scanner;

public class Pro15_Armstrong {
public static void main(String[] args) {
    int n,i,r,sum=0;
    System.out.println("Enter a Number: ");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    s.close();
    for (i=n; i>0; i/=10){
        r = i % 10;
        sum += r*r*r;
    }
    System.out.println("Armstrong of "+n+" is "+sum+".");
    if (sum == n){
        System.out.println("Hense, this is a Armstrong Number.");
    }
    else{
        System.out.println("Hense, this is not a Armstrong Number.");
    }
}    
}
