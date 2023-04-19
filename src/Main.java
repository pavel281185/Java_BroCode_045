import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // file
//        File file = new File("C:\\Users\\Laptop\\Desktop\\Nová složka\\secret_message.txt");
        File file = new File("secret_message.txt");

        if (file.exists()) {
            System.out.println("Exist");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            file.delete();
        } else {
            System.out.println("Does not exists");
            System.out.println(file.createNewFile());
        }
    }
}