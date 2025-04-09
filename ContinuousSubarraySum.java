import java.util.HashMap;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int arr[]={23,2,4,6,7};
        int k=6;
    }
    public static boolean solution(int arr[], int k){
        HashMap<Integer,Integer>mp=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int mod=k==0?sum:sum%k;
            if(mp.containsKey(mod)){
                if(i-mp.get(mod)>=2){
                    return true;
                }
            }
            else{
                mp.put(mod, i);
            }
        }
        return false;
    }
}
