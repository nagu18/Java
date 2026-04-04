public class MultipleTryCatch {
    public static void main(String[] args) {
        try{
            int a = 20,b =2, c;
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        try{
            int a[] = {10,20,30,40,23,45};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println("beyond array limit");
        }
    }
}
