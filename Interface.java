interface A {
    public static void Show(){
        System.out.println("can't override static methods");
    }
}
class Interface{
    public static void main(String[] args){
        A.Show();
    }
}