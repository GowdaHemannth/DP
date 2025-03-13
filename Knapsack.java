public class Knapsack {
    public static int Function(int W1[], int value[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        int Max = Integer.MIN_VALUE;

        if (W1[n-1] > W) {
            return Function(W1, value, W, n - 1);
        } else {
            int take = value[n-1] + Function(W1, value, W - W1[n-1], n-1 );
            int NotTake = Function(W1, value, W, n - 1);
            Max = Math.max(NotTake, take);
        }
        return Max;
    }

    public static void main(String[] args) {
        int W1[] = {1,2,3,4,5,6,7,8};
        int value[] = {3, 5, 8, 9, 10, 17, 17, 20};
        int W =  8;
        int n = W1.length;
        System.out.println(Function(W1, value, W, n));
    }
}
