import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
            FileReader: read the contents of a file as a stream of characters one by one.
                        read() method returns an integer value which contains the byte value,
                        when read() returns -1, there is no more data to be read
         */

        try {
            FileReader fileReader = new FileReader("_47.fileReader/art.txt");
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}