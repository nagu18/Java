class A3{
    int a; String b;
    A3(){
        a = 10; b = "learn";
        System.out.println(a+" "+b);

    }
    A3(A3 ref){
        a =ref.a;
        b = ref.b;
        System.out.println(a+" "+b);  
    }
}
class C{
    public static void main(String[] args){
        A3 r = new A3();
        A3 r2 = new A3(r);
    }
}