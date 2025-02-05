package inputstreamreader.bytestreamtocharstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryDataReader {
    public static void main(String[] args) {
        String filename = "D:\\example.txt";
        String charset = "UTF-8";

        try (FileInputStream fileInputStream = new FileInputStream(filename);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charset);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {  // Read the file line by line
                System.out.println(line);  // Print the characters to the console
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
