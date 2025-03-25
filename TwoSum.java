import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int k=9;
        int ans[]=solution2(arr,k);
        for(int i:ans){
            System.out.println(i);
        }
    }
    public static int[] solution(int arr[],int k){
        int i=0;
        int j=arr.length-1;
        int ans[]={-1,-1};
        while (i<=j){
            if(arr[i]+arr[j]>k){
                j--;
            }
            else if(arr[i]+arr[j]<k){
                i++;
            }
            else{
                ans[0]=i;
                ans[1]=j;
                break;
            }
        }
        return ans;
    }
    public static int []solution2(int arr[],int k){
        int ans[]={-1,-1};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=k-arr[i];
            if(mp.containsKey(a)){
                ans[0]=mp.get(a);
                ans[1]=i;
                break;
            }
            mp.put(arr[i],i);
        }
        return ans;
    }
}
