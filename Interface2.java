interface A{
    public static void Show(){
        System.out.println("can't override static methods");
    }

}
class B implements A{
    @Override
    public static void Show(){
        System.out.println("Error");
    }
}
class Interface1 {
    public static void main(String[] args){
        A.Show();
        B.obj = new B();
        obj.Show();


    }
}