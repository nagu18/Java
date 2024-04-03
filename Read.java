import java.io.FileReader;

public class Read {
    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("/Users/nagendar/Desktop/nagu.txt");
        try{
            int i;
            while(i = f.read()! = 1){
                System.out.println((char)i);
            }
        }
        finally{
            f.close();
        }
        catch

    }
}
