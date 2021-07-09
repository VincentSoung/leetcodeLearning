package string.最长公共前缀;

public class Solution {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","floight"};
        String longestPrefixf = findLongestPrefixf(strs1);
        System.out.println(longestPrefixf);

        String[] strs2 = {"dog","racecar","car"};
        String longestPrefixf1 = findLongestPrefixf(strs2);
        System.out.println(longestPrefixf1);

        String[] strs3 = {"",""};
        String longestPrefixf2 = findLongestPrefixf(strs3);
        System.out.println(longestPrefixf2);
    }
    public static String findLongestPrefixf(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String minLenStr = strs[0];
        for (String str : strs) {
            if (str.length() < minLenStr.length()) {
                minLenStr = str;
            }
        }
        if (minLenStr.length() == 0) {
            return "";
        }
        String result = null;
        out:for (int i = 0; i < minLenStr.length(); i++) {
            result = minLenStr.substring(0, i + 1);
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(result)) {
                    result = result.substring(0, result.length() - 1);
                    break out;
                }
            }
        }
        return result;
    }
    public static String findLongestPrefixf2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String minLenStr = strs[0];
        for (String str : strs) {
            if (str.length() < minLenStr.length()) {
                minLenStr = str;
            }
        }
        if (minLenStr.length() == 0) {
            return "";
        }
        String result = null;
        out:for (int i = 0; i < minLenStr.length(); i++) {
            result = minLenStr.substring(0, i + 1);
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(result)) {
                    result = result.substring(0, result.length() - 1);
                    break out;
                }
            }
        }
        return result;
    }
}
