import java.nio.file.Paths;

public class Charlie {

    public static void main(String[] args){

        // Load settings from ./settings.json


        // Set up I/O threads
        // Input (STT)
        System.out.print("Initializing speech input transcriber........ ");
        InputTranscription input = new InputTranscription();
        input.start();
        System.out.println("[ DONE ]");

        // Output (TTS)


        System.out.println("" +
                "-----------------------------\n" +
                "|         Charlie           |\n" +
                "-----------------------------\n");

    }

}
