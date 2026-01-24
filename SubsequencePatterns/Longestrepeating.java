package SubsequencePatterns;

public class Longestrepeating {
    public static int Function(String s1,String s2,int m,int n){
         if(n<0||m<0){
            return 0;
         }
         int keepS1=Integer.MIN_VALUE;
         int keepS2=Integer.MIN_VALUE;
        if(s1.charAt(m)==s2.charAt(n) && m!=n){
            return 1+Function(s1, s2, m-1, n-1);
        }else{
            keepS1=Function(s1, s2, m, n-1);
            keepS2=Function(s1, s2, m-1, n);
            return Math.max(keepS1, keepS2);
        }
    }
    public static void main(String[] args) {
        String str1="AABEBCDD";
        String str2="AABEBCDD";
        int m=str1.length()-1;
        int n=str2.length()-1;
        System.out.println(Function(str1, str2, m, n));
    }
    
}
