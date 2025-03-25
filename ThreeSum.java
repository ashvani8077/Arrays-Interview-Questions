
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(optimized(arr));
    }
    public static List<List<Integer>> brute(int arr[]){
        HashSet<ArrayList<Integer>>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        ArrayList<Integer>li=new ArrayList<>();
                        li.add(arr[i]);
                        li.add(arr[j]);
                        li.add(arr[k]);
                        Collections.sort(li);
                        hs.add(li);
                    }
                }
            }
        }
        List<List<Integer>>li2=new ArrayList<>(hs);
        return li2;
    }

    public static List<List<Integer>>brute2(int arr[]){
        Arrays.sort(arr);
        HashSet<List<Integer>>li=new HashSet<>();
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){

                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0&&(i!=j&&j!=k)){
                    List<Integer>ans=new ArrayList<>();
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                    ans.add(arr[k]);
                    j++;
                    k--;
                    li.add(ans);
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        List<List<Integer>>list=new ArrayList<>(li);
        return list;
    }

    public static List<List<Integer>> better(int arr[]) {
        HashSet<List<Integer>> hs = new HashSet<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            HashMap<Integer, Integer> mp = new HashMap<>();

            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                int check = -sum;

                if (mp.containsKey(check)) {
                    List<Integer> li = Arrays.asList(arr[i], arr[j], check);
                    hs.add(li);
                }

                mp.put(arr[j], j);
            }
        }
        return new ArrayList<>(hs);
    }

    public static List<List<Integer>>optimized(int arr[]){
        List<List<Integer>>l=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0&&arr[i]==arr[i-1]){
                continue;
            }
            int left=i+1;
            int right=arr.length-1;
            while (left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    l.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    while (left<right && arr[left]==arr[left+1]){
                        left++;
                    }
                    while (left<right && arr[right]==arr[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return l;
    }

}
