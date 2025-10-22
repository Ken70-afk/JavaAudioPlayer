import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    String filePath = "src\\Young Nudy x Tame Impala - JUGG (remix of V!KK mashup) [flCci9qO8Zc].wav";
    File file = new File(filePath);
    try( Scanner scanner = new Scanner(System.in);
         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {

        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        System.out.println("Audio file opened");

        String response= "";

        while (!response.equals("Q")) {

            System.out.println("P = Play");
            System.out.println("S = Stop");
            System.out.println("R = Restart");
            System.out.println("Q = Quit");
            System.out.print("Enter your choice: ");

            response= scanner.next().toUpperCase();

            switch (response) {
                case "P" -> clip.start();
                case "S" -> clip.stop();
                case "R" -> clip.setMicrosecondPosition(0);
                case "Q" -> clip.close();
                default -> System.out.println("Invalid choice");

            }
        }



    }catch(FileNotFoundException e) {
        System.out.println("File not found");
    }catch (IOException e){
        System.out.println("Something went wrong");
    } catch (UnsupportedAudioFileException e) {
        System.out.println("Audio file not supported");
    } catch (LineUnavailableException e) {
        System.out.println("Unable to access audio resource");
    }
    finally {
        System.out.println("Closing");
    }

    }
}
