class A {
    A(){
        System.out.println("Hello viewer");
    }

}
class B{
    B(){
        System.out.println("Hello learn");
    }
}
class DefaultContrator{
    public static void main(String[] args){
        B r = new B();
        A m = new A();

    }
}

