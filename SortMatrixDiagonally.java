import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortMatrixDiagonally {
    public static void main(String[] args) {
        int arr[][]={
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2}
        };
    }
    public static int[][]solution(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        HashMap<Integer, List<Integer>>mp=new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                mp.putIfAbsent(key, new ArrayList<>());
                mp.get(key).add(arr[i][j]);
            }
        }

        for (List<Integer> list : mp.values()) {
            Collections.sort(list, Collections.reverseOrder());
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                arr[i][j] = mp.get(key).remove(mp.get(key).size() - 1);
            }
        }
        return arr;

    }
}
