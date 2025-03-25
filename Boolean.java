public class Boolean {
    public static int WaysTOBeTrue(String s, int i, int j, boolean isTrue) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            if (isTrue) {
                return s.charAt(i) == 'T' ? 1 : 0;
            } else {
                return s.charAt(i) == 'F' ? 1 : 0;
            }
        }

        int ans = 0;
        for (int k = i + 1; k <= j - 1; k = k + 2) {  // Fix loop condition
            int LeftTrue = WaysTOBeTrue(s, i, k - 1, true);
            int LeftFalse = WaysTOBeTrue(s, i, k - 1, false);
            int RightTrue = WaysTOBeTrue(s, k + 1, j, true);
            int RightFalse = WaysTOBeTrue(s, k + 1, j, false);

            char oper = s.charAt(k);
            if (oper == '&') {
                if (isTrue) {
                    ans = ans + (LeftTrue * RightTrue);
                } else {
                    ans = ans + (LeftFalse * RightTrue) + (LeftTrue * RightFalse) + (LeftFalse * RightFalse);
                }
            } else if (oper == '|') {
                if (isTrue) {
                    ans = ans + (LeftTrue * RightFalse) + (LeftFalse * RightTrue) + (LeftTrue * RightTrue); // Fix OR computation
                } else {
                    ans = ans + (LeftFalse * RightFalse);
                }
            } else if (oper == '^') {
                if (isTrue) {
                    ans = ans + (LeftFalse * RightTrue) + (LeftTrue * RightFalse);
                } else {
                    ans = ans + (LeftTrue * RightTrue) + (LeftFalse * RightFalse);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "F|T^F";
        System.out.println(WaysTOBeTrue(s, 0, s.length() - 1, true));  // Fix length issue
    }
}
