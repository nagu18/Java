public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int a = 10, b = 2, c;
            c =a/b;
            System.out.println(c);
            int arr[] = {10,20,30};
            System.out.println(arr[0]);
            String str = null;
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array Exception");
        }
        catch(ArithmeticException b){
            System.out.println("Arithmetic Exception");
        }
        catch(NumberFormatException c){
            System.out.println("Number Exception");
        }
        catch(Exception d){
            System.out.println("All Exception");
        }
    }
}
