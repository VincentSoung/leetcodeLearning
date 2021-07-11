package string.最长回文字串;

public class Solution {
    public static void main(String[] args) {
        String s = "babad";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }

    /**
     * 暴力解法.
     * 遍历所有的字串，并校验字串是否为回文.
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 3) {
            return s;
        }
        int maxLen = 1;
        int start = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length() ; j++) {
                if (j - i + 1 > maxLen && isPalindrome(charArray, i, j)) {
                    // s[i...j]是回文，并且s[i...j]的长度大于maxLen
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }
        String res = s.substring(start, start + maxLen);
        return res;
    }

    /**
     * 判断  s[left...right] 是否是回文.
     * @param charArray
     * @param left
     * @param right
     * @return
     */
    private static boolean isPalindrome(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                // 字串的最左端 和最右端不同时，表示 不是回文
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
