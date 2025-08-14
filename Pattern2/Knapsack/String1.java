public class String1 {
    //Here we are Going to Find out the Longest SubSequence 

    public static int LongestSubSequeunce(String S1,String S2,int n,int m){
        if(n<0||m<0){
            return 0;
        }
        // Now if theSubString Matches 
        if(S1.charAt(n)==S2.charAt(m)){
            return 1+LongestSubSequeunce(S1, S2, n-1, m-1);
        }else{
            return Math.max(LongestSubSequeunce(S1, S2, n-1, m),LongestSubSequeunce(S1, S2, n, m-1));
        }
        


    }
    public static void main(String[] args) {
        String S1="acd";
        String S2="ced";
         
        int n=S1.length()-1;
        int m=S2.length()-1;
        System.out.println(LongestSubSequeunce(S1, S2, n, m));
    }
    
}
