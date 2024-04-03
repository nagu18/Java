public class FinnyTryBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Learn");
            int a = 20, b = 2,c;
            c =a/b;
            System.out.println(c);
            System.out.println("like");
        }
        catch(Exception e){
            System.out.println("cannot divide by zero");
        }
        finally{
            System.out.println("share");
            System.out.println("main method eneded");
        }
    }
}
