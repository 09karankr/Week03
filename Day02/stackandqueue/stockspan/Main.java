package stockspan;

public class Main {
    public static void main(String[] args) {
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        // **Testing next() method (Brute Force Approach)**
        System.out.println("Stock Spans using next() method:");
        int[] testPrices = {100, 80, 60, 70, 60, 75, 85};
        for (int price : testPrices) {
            System.out.print(stockSpan.next(price) + " ");
        }
        System.out.println(); // New line

        // **Testing calculateSpans() method (Optimized Stack Approach)**
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = stockSpan.calculateSpans(prices);

        System.out.println("\nStock Spans using calculateSpans() method:");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}
