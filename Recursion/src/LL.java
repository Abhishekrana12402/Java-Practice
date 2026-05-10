import java.util.*;

class LL {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  // Sort to handle duplicates and for efficient pruning
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerlist = new ArrayList<>();
        Helper(list, innerlist, candidates, target, 0);
        return list;
    }

    void Helper(List<List<Integer>> list, List<Integer> inner, int[] arr, int target, int index) {
        if (target == 0) {
            list.add(new ArrayList<>(inner));  // Found a valid combination
            return;
        }

        for (int i = index; i < arr.length; i++) {
            // Skip duplicates
            if (i > index && arr[i] == arr[i - 1]) continue;

            // Early termination if the current number is greater than the remaining target
            if (arr[i] > target) break;

            inner.add(arr[i]);
            Helper(list, inner, arr, target - arr[i], i + 1);  // Move to the next index
            inner.remove(inner.size() - 1);  // Backtrack
        }
    }

    public static void main(String[] args) {
       LL LL=new LL();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> result = LL.combinationSum2(candidates, target);
        System.out.println(result);
    }
}
