import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        // Specify the directory where you want to create the file
        File directory = new File("/Users/nagendar/Desktop");

        // Specify the file name
        String fileName = "test.txt";

        // Create a File object with the directory and file name
        File file = new File(directory, fileName);

        try {
            // Attempt to create the file
            if (file.createNewFile()) {
                System.out.println("File Successfully created");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            // Handle any exceptions that may occur during file creation
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
