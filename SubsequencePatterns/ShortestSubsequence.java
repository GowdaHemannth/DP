package SubsequencePatterns;

// Example 1='Geek'  Example 2='eke'  After Adding Both the Strings what would be the Thing
// After mixing boh String Would be 'Geeke' here we need to Return the lENGTH OF THESE 
// bASIC IDEA IS Example1+Example2-LCS Becuase After Substacting it will Give the 
// Accurate thing by eliminating the Comman Sequence
public class ShortestSubsequence {
     public static int Function(String s1,String s2,int m,int n){
         if(n==0||m==0){
            return 0;
         }
         int keepS1=Integer.MIN_VALUE;
         int keepS2=Integer.MIN_VALUE;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+Function(s1, s2, m-1, n-1);
        }else{
            keepS1=Function(s1, s2, m, n-1);
            keepS2=Function(s1, s2, m-1, n);
            return Math.max(keepS1, keepS2);
        }
    }
    public static void main(String[] args) {
         String str1="Geek";
        String str2="eke";
        int m=str1.length();
        int n=str2.length();
        int Length=Function(str1, str2, m, n);
        System.out.println(m+n-Length);
        // Here i will Be Taking Length Indexing Differnt 
        // If you Take Length As Zero indexing Then Add +2 Becuase of Two Strings.
    }
    
}
