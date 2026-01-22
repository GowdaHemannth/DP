package SubsequencePatterns;

import java.util.Arrays;

//  
public class LongestSubSequencememoization {
     
    public static int Function(String s1, String s2, int m, int n, int DP[][]) {

        if (m == 0 || n == 0) {
            return 0;
        }

        if (DP[m][n] != -1) {
            return DP[m][n];
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return DP[m][n] = 1 + Function(s1, s2, m - 1, n - 1, DP);
        } else {
            int keepS1 = Function(s1, s2, m, n - 1, DP);
            int keepS2 = Function(s1, s2, m - 1, n, DP);
            return DP[m][n] = Math.max(keepS1, keepS2);
        }
    }
    public static void main(String[] args) {
         String str1="abcdgh";
        String str2="abedfhr";
        int m=str1.length();
        int n=str2.length();
        int DP[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                  DP[i][j]=-1;
            }
           
        }
        Function(str1, str2, m, n, DP);
        System.out.println(DP[m][n]);
    }
    
}
