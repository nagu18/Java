public class A2 {
    public static void Add()
    {
        int a = 10, b = 20;
        System.out.println("Sum = " + (a+b));
    }
    public static void main(String[] args) {
        A2 r = new A2();
        r.Disp();
        A2.Add();
    }
    void Disp()
    {
        System.out.print("Learn Coding\n");
    }
}
