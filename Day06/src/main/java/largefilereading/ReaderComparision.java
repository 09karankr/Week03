package largefilereading;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderComparision {
    public static long FileReaderTime(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        long startTime = System.nanoTime();
        while (reader.read()!= -1);
            return (System.nanoTime() - startTime)/1000000;

    }
    public static long InputStreamTime(String filePath) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
        long startTime = System.nanoTime();
        while (reader.read() != -1);
        return  (System.nanoTime() - startTime)/1000000;
    }
}
