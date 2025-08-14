public class String2 {
    public static boolean Print(String S1, String S2, int m, int n) {
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

        int i = m, j = n;
        StringBuilder sb = new StringBuilder();

        // Construct the LCS
        while(i > 0 && j > 0){
            if(S1.charAt(i-1) == S2.charAt(j-1)){
                sb.append(S1.charAt(i-1));
                i--;
                j--;
            } else if (dp[i][j-1] > dp[i-1][j]) {
                j--;
            } else {
                i--;
            }
        }

        // Check if one string is a subsequence of another
        return sb.length() == S1.length() || sb.length() == S2.length();
    }

    public static void main(String[] args) {
        String s1 = "axf";
        String s2 = "adxcpf";
        System.out.println(Print(s1, s2, s1.length(), s2.length()));
    }
}
