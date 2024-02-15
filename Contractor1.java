public class Contractor1 {
    int a; String b; boolean c;
    Contractor1()
    {
        a =100; b = "abc"; c = true;
    }
    void Disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class B{
    public static void main(String[] args)
    {
        Contractor1 r = new Contractor1();
        r.Disp();
    }
}
