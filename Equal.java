public class Equal {
    static int a = 10 ,b = 20;
    int c;
    //constructor
    Equal(){
        System.out.println("Addition of 10 and 20:");
        c = a+b;
        System.out.println("Answer");
    }
    public static void main(String[] args) {
        System.out.println("1st obj created");
        Equal obj1 = new Equal();
        System.out.println("2nd obj created");
        Equal obj2 = new Equal();
        System.out.println("Object are equal: " + obj1.equals(obj2));
        System.out.println("Object are equal: " + obj1.equals(obj1));
    }
}
