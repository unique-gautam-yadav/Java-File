public class Pro24_Inheritance {
    public static void main(String[] args) {
        Two aa = new Two();
        aa.name("Gautam");
        aa.course("Diploma");
    }
}

class One{
    void name(String name)
    {
        System.out.println("Your Name "+name+".");
    }
}
class Two extends One{
    void course(String cou)
    {
        System.out.println("You are in "+cou+".");
    }
}