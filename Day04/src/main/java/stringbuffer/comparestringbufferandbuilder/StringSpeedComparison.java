package stringbuffer.comparestringbufferandbuilder;

public class StringSpeedComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "Elephant";

        // Measure time for StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        // Measure time for StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;


        System.out.println("Time taken by StringBuffer: " + timeBuffer / 1_000_000.0 + " ms");
        System.out.println("Time taken by StringBuilder: " + timeBuilder / 1_000_000.0 + " ms");
    }
}
