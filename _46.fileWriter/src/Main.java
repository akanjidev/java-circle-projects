import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            FileWriter fileWriter = new FileWriter("_46.fileWriter/poem.txt");
            fileWriter.write("Roses are red\nViolets are blue");
            fileWriter.append("\nA poem by Me");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}