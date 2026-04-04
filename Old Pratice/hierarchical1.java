class K {
    void input(){
        System.out.println("Enter your name: ");
    }
}class B extends K{
    void show(){
        System.out.println("My name is ravi");
    }
}
class C extends B{
    void dis(){
        System.out.println("My name is Rohit");
    }
}
class hierarchical1 {
    public static void main(String[] args){
        B r = new B();
        C r2 = new C();
        r.input();
        r2.input();
        r.show();
        r2.show();
    }
}