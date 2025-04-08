import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int k=3;
        System.out.println(solution(arr,k));
    }
    public static boolean solution(int arr[], int k){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&&(Math.abs(i-j)<=k)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean solution2(int arr[], int k){
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i]) && Math.abs(mp.get(arr[i]) - i) <= k) {
                return true;
            }
            mp.put(arr[i], i);
        }

        return false;
    }
}
