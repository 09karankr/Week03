package filereader.readfilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HandleFileReading {
    private String filePath;

    public HandleFileReading(String filePath) {
        this.filePath = filePath;
    }

    public void readFile() {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print each line
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
