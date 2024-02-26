class A12 {
    void show(){
        System.out.println("Hello viewer");
    }
}
class B extends A12{
    void show(){
        super.show();
        System.out.println("Hello learn");
    }
}
class SuperFun{
    public static void main(String[] args){
        B r = new B();
        r.show();
    }
}