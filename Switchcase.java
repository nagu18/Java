import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args){
        int a,b,ch;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the first value");
        a = r.nextInt();
        System.out.println("Enter the second value ");
        b = r.nextInt();
        System.out.println("Enter the choice");
        ch = r.nextInt();
        switch(ch)
        {
            case 1:{
                System.out.println("sum = " + (a+b));
            }
            break;
            case 2:{
                System.out.println("sub = " + (a-b));
            }
            break;
            case 3:{
                System.out.println("mul = " + (a*b));
            }
            break;
            case 4:{
                System.out.println("Div = " + (a/b));
             }
             default: {
                System.out.println("invalid values"); 
             }

        }

    }
}
