public class String2 {
    public static void Print(String S1,String S2,int m,int n){
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            dp[0][i]=0;
        }
        for(int j=0;j<n;j++){
            dp[j][0]=0;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(S1.charAt(i-1)==S2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int i=m;
        int j=n;
        StringBuilder sb=new StringBuilder();

        while(i>0&&j>0){
            if(S1.charAt(i-1)==S2.charAt(j-1)){
                sb.append(S1.charAt(i-1));
                i--;
                j--;
            }else if (dp[i][j-1]>dp[i-1][j]) {
                j--;

                
            }else{
                i--;
            }
        }

        System.out.println(sb.reverse());
    }
    public static void main(String[] args) {
        String s1="acbcf";
        String s2="abcdaf";
        int m=s1.length();
        int n=s2.length();
        Print(s1, s2, m, n);
    }
    
}
