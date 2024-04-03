import java.io.*;
class info
{
    public static void main(String[] args) {
        File f = new File("/Users/nagendar/Desktop/myfile");
        if(f.exists()){
            System.out.println("File Name:" +f.getName());
            System.out.println("File Location:" +f.getAbsolutePath());
            System.out.println("File Name:" +f.canWrite());
            System.out.println("File Name:" +f.canRead());
            System.out.println("File Name:" +f.length());

        }
        else
        {
            System.out.println("File doesnot Exitsts");
        }
    }
}