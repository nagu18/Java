import java.util.Scanner;
class Arraysum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[]totalnumber = new int[size];
        for(int i = 0; i < size; i++){
            totalnumber[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum = sum + totalnumber[i];
        }
        System.out.println(sum);
 


    }
}