package stringconcatenation;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1000, 10000, 1000000};
        for(int i: arr){
            System.out.println("Testing with N = " + i);
            long timeString = TimeComparison.testStringConcatenation(i);
            System.out.println("String Concatenation Time: " + timeString + " ms");

            long timeStringBuilder = TimeComparison.testStringBuilderConcatenation(i);
            System.out.println("StringBuilder Concatenation Time: " + timeStringBuilder + " ms");

            long timeStringBuffer = TimeComparison.testStringBufferConcatenation(i);
            System.out.println("StringBuffer Concatenation Time: " + timeStringBuffer + " ms");


        }
    }
}
