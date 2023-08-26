import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);
        File file = new File("_48.audio/smooth.wav"); // pass the path of the audio to the constructor
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        // clip.start(); the start will tempt to play the audio in the background
        String res = "";

        while (!res.equals("Q")) {
            System.out.println("P: Play, R: Reset, S: Stop, Q: Quit");
            System.out.print("Enter your choice");

            res = scanner.next();
            res = res.toUpperCase();

            switch (res) {
                case ("P") -> clip.start();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("S") -> clip.stop();
                case ("Q") -> clip.close();
                default -> System.out.println("Invalid key");
            }
        }
        System.out.println("Good Bye");
    }
}