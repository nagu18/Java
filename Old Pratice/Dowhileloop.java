import java.util.Scanner;
public class Dowhileloop {
    public static void main(String[] args){
        int n,i = 1,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to find sum --->");
        n = input.nextInt();
        do{
            sum = sum+i;
            i+=1;
        }while(i<=n);
        System.out.print("System of first"+n+"number is = "+sum);

    }
}
