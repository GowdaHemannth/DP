package SubsequencePatterns;
public class LongestSubsequencetabulation{
    public static void main(String[] args) {
       // Here in TABULATION iTS nOTHING BUT THE aCTUAL chanfging memozition code becuase you can chnage Recursion Code Aslo 
       // But the thimng if you Used Zero Indexing In Recurion it would toppugh hence use length indexing it wopuld Eay
         String S1="abcdgh";
        String S2="abedfhr";
        int m=S1.length();
        int n=S2.length();
           int dp[][] = new int[m+1][n+1];

        // Corrected DP table initialization
        for(int i = 0; i <= m; i++) dp[i][0] = 0;
        for(int j = 0; j <= n; j++) dp[0][j] = 0;

        // Corrected DP filling loop
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(S1.charAt(i-1) == S2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
    }

}