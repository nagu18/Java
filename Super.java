class La {
    int a = 10;

}
class B extends La{
    int a = 20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
class Super{
    public static void main(String[] args){
        B r = new B();
        r.show();
    }
}