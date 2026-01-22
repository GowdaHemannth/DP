package SubsequencePatterns;

// These is Quite Different Fom
public class LongestSubString {
   static int maxLen = 0;

    public static void Function(String s1, String s2, int m, int n, int length) {

        if (m < 0 || n < 0) {
            return;
        }

        if (s1.charAt(m) == s2.charAt(n)) {
            length++;
            maxLen = Math.max(maxLen, length);
            Function(s1, s2, m - 1, n - 1, length);
        } else {
            // substring breaks
            Function(s1, s2, m - 1, n, 0);
            Function(s1, s2, m, n - 1, 0);
        }
    }
    public static void main(String[] args) {
                String str1="abcdgh";
        String str2="abedfhr";
        int m=str1.length()-1;
        int n=str2.length()-1;
        System.out.println();
        
    }
    
}
