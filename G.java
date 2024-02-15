class F {
    int a;
    double b;
    String c;
    F(){
        a =10;
        b = 45.56; 
        c = "learn";
    }
    F(int x){
        a = x;

    }
    F(double y,String z){
        b=y;
        c = z;
    }
}
class G{
    public static void main(String[] args) {
        F r = new F();
        F r2 = new F(10);
        F r3 = new F(23.89,"learn");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c); 
    }
}
