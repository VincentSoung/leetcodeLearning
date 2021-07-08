package 对角线遍历;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[] diagonlOrder = findDiagonlOrder(array);
        System.out.println(Arrays.toString(diagonlOrder));
    }
    public static int[] findDiagonlOrder(int[][] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int temp = i + j;
                List<Integer> list = null;
                if (map.containsKey(temp)) {
                     list = map.get(temp);
                } else {
                    list = new ArrayList<>();
                    map.put(temp, list);
                }
                list.add(array[i][j]);
            }
        }
//        int[] result = new int[array.length * array[0].length];
        List<Integer> result = new ArrayList<>();
        Iterator<Map.Entry<Integer, List<Integer>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, List<Integer>> next = iterator.next();
            Integer key = next.getKey();
            List<Integer> value = next.getValue();
            if ((key & 1) == 0) {
                Collections.reverse(value);
            }
            result.addAll(value);
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
