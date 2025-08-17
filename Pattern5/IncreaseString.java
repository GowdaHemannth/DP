import java.util.*;
public class IncreaseString {
   static Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
   public static boolean Compare(String S1,String S2){
    if(S1.length()!=S2.length()+1){
        return false;
    }
    int first=0;int second=0;
    while(first<S1.length()){
        if(second<S2.length()&&S1.charAt(first)==S2.charAt(second)){
            first++;
            second++;

        }else{
            first++;
        }
    }
    return first==S1.length()&&second==S2.length();


   }
    public static int Function(List<String>Words){

        int n=Words.size();
        Words.sort(comp);
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int maxi=1;
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(Compare(Words.get(i), Words.get(prev))&&1+dp[prev]>dp[i]){
                    dp[i]=1+dp[prev];

                }
                if(dp[i]>maxi){
                    maxi=dp[i];
                }
            }
        }
        return maxi;

    }
    public static void main(String[] args) {
        List<String>Words=Arrays.asList("a","b","ba","bca","bda","bdca");
       System.out.println(Function(Words)) ;

        
    }
    
}
