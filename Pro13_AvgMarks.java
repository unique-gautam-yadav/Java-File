import java.util.Scanner;
class Pro13_AvgMarks{
    public static void main(String args[]) {
        int avg=0, i,sub;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("<------------------------   Enter Number of Subjects   ------------------------>");
            sub = s.nextInt();
            for (i=1; i<=sub; i++){
                System.out.println("Enter marks of "+(i)+" Subject: ");
                avg += s.nextInt();
            }
        }
        // System.out.println("Total num of subs is "+i+".");
        System.out.println("Average Marks: "+avg/(i-1)+".");

    }
}