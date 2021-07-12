package string.反转字符串里的单词;

public class Solution {
    public static void main(String[] args) {
//        String s1 = "the sky is blue";
//        System.out.println("before reverse:" + s1);
//        String s = reverseWords(s1);
//        System.out.println("after  reverse:" + s);
//        System.out.println("---------------------------");

        String s2 = "  hello world  ";
        System.out.println("before reverse:" + s2);
        String s22 = reverseWords(s2);
        System.out.println("after  reverse:" + s22);
        System.out.println("---------------------------");

//        String s3 = "a good   example";
//        System.out.println("before reverse:" + s3);
//        String s33 = reverseWords(s3);
//        System.out.println("after  reverse:" + s33);
//        System.out.println("---------------------------");
//
//        String s4 = "  Bob    Loves  Alice   ";
//        System.out.println("before reverse:" + s4);
//        String s44 = reverseWords(s4);
//        System.out.println("after  reverse:" + s44);
//        System.out.println("---------------------------");
    }
    public static String reverseWords(String s) {
        if (s == null || s.trim().length() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        String[] s1 = s.split(" ");
        for (int i = s1.length - 1; i > 0; i--) {
            if (!"".equals(s1[i])) {
                stringBuffer.append(s1[i]).append(" ");
            }
        }
        if ("".equals(s1[0])) {
            stringBuffer.delete(stringBuffer.lastIndexOf(" "), stringBuffer.length());
        } else {
            stringBuffer.append(s1[0]);
        }
        return stringBuffer.toString();
    }
}
