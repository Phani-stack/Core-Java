package FilesInJava;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\phani\\OneDrive\\Desktop\\test\\omg.txt");
        // System.out.println(file.createNewFile());
        // System.err.println(file.exists());
        System.out.println(file.delete());
        
    }
}
