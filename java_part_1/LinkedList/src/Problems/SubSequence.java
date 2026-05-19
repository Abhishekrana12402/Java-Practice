package Problems;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SubSequence {


        // Function to generate all subsequences of an array
        public static int findAllSubsequences(int[] arr,int k) {
            List<List<Integer>> subsequences = new ArrayList<>();
            int n = arr.length;
            for (int i = 0; i < (1 << n); i++) {
                List<Integer> subsequence = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0) {
                        subsequence.add(arr[j]);
                    }
                }
                subsequences.add(subsequence);
            }
            System.out.println(subsequences);

            return Check(subsequences,k);
        }
        static int Check(List<List<Integer>>list,int k) {

int flag=0;
            for (List<Integer> row : list) {
                int count=0;
                for (int i = 1; i < row.size(); i++) {
                    if (row.get(i) >row.get(i - 1)) {
                        count++;
                    }
                }
                if(count==row.size()-1&&row.size()==k+1){
                  flag++;
                }
            }
            return flag;
        }

        public static void main(String[] args) {
            int[] arr = {1,2,3};
            System.out.println(findAllSubsequences(arr,2));
        }
    }

