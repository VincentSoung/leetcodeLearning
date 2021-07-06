package 合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        List<int[]> newIntervals = new ArrayList<int[]>();
        int j = 0;
        for (int i = 0; i < intervals.length; i++) {
            int lValue = intervals[i][0];
            int rValue = intervals[i][1];
            if (newIntervals.size() == 0 || newIntervals.get(newIntervals.size() - 1)[1] < lValue) {
                newIntervals.add(new int[]{lValue, rValue});
            } else {
                if (newIntervals.get(newIntervals.size() - 1)[1] < rValue) {
                    newIntervals.get(newIntervals.size() - 1)[1] = rValue;
                }
            }
        }
        return newIntervals.toArray(new int[newIntervals.size()][]);
    }
}
