public class Coins {
    public static int Minimum(int coin[], int sum, int n) {
        if (sum == 0) {
            return 0;  // No coins are needed
        }
        if (n < 0) {
            return Integer.MAX_VALUE - 1; // Large value to prevent overflow
        }
        
        int take = Integer.MAX_VALUE;
        if (coin[n] <= sum) {
            take = 1 + Minimum(coin, sum - coin[n], n); // Use the same coin
        }
        
        int notTake = Minimum(coin, sum, n - 1); // Skip the coin
        
        return Math.min(take, notTake);
    }

    public static void main(String[] args) {
        int coin[] = {1, 2, 3};
        int sum = 5;
        int n = coin.length - 1;
        int result = Minimum(coin, sum, n);
        
        System.out.println(result == Integer.MAX_VALUE - 1 ? -1 : result);
    }
}
