package filereader.readfilelinebyline;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\example.txt"; // Replace with your file path
        HandleFileReading fileReaderUtil = new HandleFileReading(filePath);
        fileReaderUtil.readFile();
    }
}
