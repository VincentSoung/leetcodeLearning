package 旋转矩阵;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("before:");
        print(array1);
        rotate(array1);
        System.out.println("after:");
        print(array1);

        int[][] array2 = {{5, 1, 9, 11}, {2,4, 8, 10}, {13, 3, 6, 7},{15,14,12,16}};
        System.out.println("before:");
        print(array2);
        rotate(array2);
        System.out.println("after:");
        print(array2);
    }

    public static void rotate(int[][] matrix) {
        if (matrix.length <= 1) {
            return;
        }
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < matrix[i].length-i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length-1-j][length-1-i];
                matrix[length-1-j][length-1-i] = temp;
            }
        }

        int len = length / 2;
        for (int i = 0; i < len; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[length-1-i];
            matrix[length-1-i] = temp;
        }
    }
    public static void rotate2(int[][] array) {
        if (array.length <= 1) {
            return;
        }
        crossWiseRotate(array);
        topBottom(array);
    }

    /**
     * 上下转换.
     * @param array
     */
    public static void topBottom(int[][] array) {
        int length = array.length;
        int len = length / 2;
        for (int i = 0; i < len; i++) {
            int[] temp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = temp;
        }
    }

    /**
     * 对角转换
     * @param array
     */
    public static void crossWiseRotate(int[][] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array[i].length-i; j++) {
                int temp = array[i][j];
                array[i][j] = array[length-1-j][length-1-i];
                array[length-1-j][length-1-i] = temp;
            }
        }
    }
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[1].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
