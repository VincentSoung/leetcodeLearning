package string.最长回文字串;

public class Solution2 {
    public static void main(String[] args) {
        String s = "babad";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }

    /**
     * 中心扩展法
     * 遍历每个字符，以每个字符为中心，向两侧扩展，找到 奇数和偶数的 回文字串，取最长.
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
        for (int i = 0; i < s.length(); i++) {
            int olldLen = expandAroundCenter(charArray, i, i);
            int evenLen = expandAroundCenter(charArray, i, i + 1);

            int curMaxLen = Math.max(olldLen, evenLen);
            if (curMaxLen > maxLen) {
                maxLen = curMaxLen;
                start = i - (maxLen - 1)/2;
            }
        }
        return s.substring(start, start + maxLen);
    }

    /**
     * 以left为中心向两侧 扩散，找到最长的回文字串长度.
     * 当 left == right 时, 回文长度为奇数；
     *    right == left + 1 时，回文长度为偶数;
     * @param charArray
     * @param left
     * @param right
     * @return
     */
    private static int expandAroundCenter(char[] charArray, int left, int right) {
        while (left > 0 && right < charArray.length) {
            if (charArray[left] != charArray[right]) {
                // 恰好 不相等，回文字串的长度 不包括left 和right
                break;
            }
            left--;
            right++;
        }
        // right - left + 1 -2
        return right - left - 1;
    }
}
