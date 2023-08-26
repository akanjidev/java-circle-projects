import java.io.File;

public class Main {
    public static void main(String[] args) {
        /*
            file: an abstract representation of file and directory pathname
         */

        File file = new File("_45.FileClass/secret_message.txt");

        if (file.exists()) { // true if the file exists
            System.out.println("That file exists :)");
            System.out.println(file.getPath()); // get the file path
            System.out.println(file.getAbsolutePath()); // get the absolute file path on the system
            System.out.println(file.isFile()); // true if file is file not a directory
            file.deleteOnExit(); // deletes file
        } else {
            System.out.println("That file does not :( exist");
        }
    }
}