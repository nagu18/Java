import java.util.Scanner;
public class Tem {
    public static void main(String[] args){
        Scanner scanner = new Scanner();
        int r;
        int c;
        int [][] m1 = new int[r][c];
        int [][]m2 = new int [r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                m1[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<r; i++){
           for(int j=0; j<c; j++){
            m2[i][j] = scanner.nextInt();
        }
     }
     
}
