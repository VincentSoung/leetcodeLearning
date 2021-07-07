package 零矩阵;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[][] array = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(array);
        System.out.println(Arrays.deepToString(array));
    }
    public static void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cloums = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cloums.add(j);
                }
            }
        }
        Integer[] rowsArray = rows.toArray(new Integer[0]);
        Integer[] cloumsArray = cloums.toArray(new Integer[0]);
        for (int i = 0; i < rowsArray.length; i++) {
            int tempRowIndex = rowsArray[i];
            for (int j = 0; j < matrix[tempRowIndex].length; j++) {
                matrix[tempRowIndex][j] = 0;
            }
        }
        for (int i = 0; i < cloumsArray.length; i++) {
            int tempcloumIndex = cloumsArray[i];
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][tempcloumIndex] = 0;
            }
        }
    }
    public static void setZeroes2(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cloums = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cloums[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            boolean rowTrue = rows[i];
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowTrue || cloums[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
