import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int arr[]={-1,2,1,-4};
        int target=1;
        System.out.println(solution(arr,target));
    }
    public static int solution(int arr[], int target){
        int ans=100000;
        Arrays.sort(arr);
        for(int k=0;k<=arr.length-3;k++){
            int i=k+1;
            int j=arr.length-1;
            while (i<j){
                int sum=arr[i]+arr[j]+arr[k];
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                if(sum<target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return ans;
    }
}
