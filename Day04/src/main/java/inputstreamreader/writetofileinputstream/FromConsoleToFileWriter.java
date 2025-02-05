package inputstreamreader.writetofileinputstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FromConsoleToFileWriter {
    public static void main(String[] args) {
        String filePath = "D:\\example.txt";  // Output file path

        try (
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                FileWriter fileWriter = new FileWriter(filePath, true) // Appending to file
        ) {
            System.out.println("Enter text (type 'exit' to quit):");

            String inputLine;
            while (true) {
                inputLine = br.readLine();


                if ("exit".equalsIgnoreCase(inputLine)) {
                    System.out.println("Exiting... Data saved to " + filePath);
                    break;
                }

                // Write user input to the file
                fileWriter.write(inputLine + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error handling the file: " + e.getMessage());
        }
    }
}
