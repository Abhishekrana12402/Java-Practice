package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
       int[][] arr= {{1, 2}, {1, 3}, {1, 6}, {3, 4}, {4, 4}, {4, 5}, {5, 5}, {6, 6}, {6, 6}};
        System.out.println(mergeOverlappingIntervals(arr));
    }

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        List<List<Integer>> OuterList = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparing(row->row[0]));
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {

        }

        return OuterList;
    }
}
