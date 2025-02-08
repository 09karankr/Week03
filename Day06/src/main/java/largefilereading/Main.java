package largefilereading;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Comparison on the file");
            String filePath = "C:\\Users\\karan\\Downloads\\100mb-examplefile-com.txt";
            long fileReaderTime = ReaderComparision.FileReaderTime(filePath);
            System.out.println("The time taken to read File by FileReader : " + fileReaderTime + " ms");
            long InputStreamReaderTime = ReaderComparision.InputStreamTime(filePath);
            System.out.println("The time taken to read File by InputStreamReader : " +InputStreamReaderTime+ " ms");
        }catch (IOException e){
            System.out.println("The file is not found");
        }
    }
}
