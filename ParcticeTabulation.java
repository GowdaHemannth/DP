public class ParcticeTabulation {
    public static void main(String[] args) {
        int W1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int value[] = { 3, 5, 8, 9, 10, 17, 17, 20 };
        int W = 8;
        int n = W1.length;
        int DP[][] = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    DP[i][j] = 0;
                
                }
            }
        }
       
        for (int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(W1[i-1]>j){
                    DP[i][j]=DP[i-1][j];
                }
                else{
                    DP[i][j]=Math.max(DP[i-1][j],value[i-1]+DP[i-1][j-W1[i-1]]);
                }
            }
        }
        System.out.println(DP[n][W]);
    }
}
