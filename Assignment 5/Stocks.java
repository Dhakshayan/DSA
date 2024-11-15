import java.util.ArrayList;

public class Stocks {
    public static ArrayList<int[]> stockBuySell(int[] prices, int n) {
        ArrayList<int[]> result = new ArrayList<>();
        int i = 0;
        while (i < n - 1) {
            while (i < n - 1 && prices[i + 1] <= prices[i]) i++;
            if (i == n - 1) break;
            int buy = i++;
            while (i < n && prices[i] >= prices[i - 1]) i++;
            int sell = i - 1;
            result.add(new int[]{buy, sell});
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        int n = prices.length;
        ArrayList<int[]> result = stockBuySell(prices, n);
        if (result.isEmpty()) System.out.println("No Profit");
        else for (int[] segment : result) System.out.println("Buy on day: " + segment[0] + ", Sell on day: " + segment[1]);
    }
}
