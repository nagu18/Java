class Mul{
    int a,b,c;
    void add(){
    a = 10; b = 20; c = a+b;
    System.out.println("Sum of two num: " + c);
    }
    void sub(){
        a = 200; b = 100; c = a-b;
        System.out.println("Sub of two num: "+c);
    }
}
class B extends Mul{
    void multi(){
        a = 10; b = 20; c = a*b;
        System.out.println("Multiplication of two num: "+c);
    }
    void div(){
        a = 10; b = 2; c = a/b;
        System.out.println("divistion of two num: "+c);
    }
}
class Multilevel extends B{
    void rem(){
        a = 10; b = 3; c = a%b;
        System.out.println("remainder of two num: "+c);
    }
    public static void main(String[] args){
    Multilevel obj = new Multilevel();
    obj.add();
    obj.rem();
    obj.sub();
    obj.multi();
    obj.div();
    }

}

