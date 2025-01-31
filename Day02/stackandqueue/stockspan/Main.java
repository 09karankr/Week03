package stockspan;

public class Main {
    public static void main(String[] args) {
        OnlineStockSpan stockSpan = new OnlineStockSpan();


        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = stockSpan.calculateSpans(prices);

        System.out.println("\nStock Spans using calculateSpans() method:");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}
