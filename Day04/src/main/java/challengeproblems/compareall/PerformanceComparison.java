package challengeproblems.compareall;

import java.io.*;
import java.util.StringTokenizer;

public class PerformanceComparison {
    public static void main(String[] args) {

        System.out.println("Starting string concatenation comparison...");

        String sampleText = "hello";
        int iterations = 1_000_000;


        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(sampleText);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");

        // StringBuffer Test
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(sampleText);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");


        System.out.println("\nStarting file reading and word count...");
        String filePath = "D:\\example.txt";

        try {

            long wordCount = countWordsUsingReader(new FileReader(filePath));
            System.out.println("Word count using FileReader: " + wordCount);


            wordCount = countWordsUsingReader(new InputStreamReader(new FileInputStream(filePath)));
            System.out.println("Word count using InputStreamReader: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long countWordsUsingReader(Reader reader) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            long wordCount = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                wordCount += tokenizer.countTokens();
            }
            return wordCount;
        }
    }
}
