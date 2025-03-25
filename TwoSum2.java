public class TwoSum2 {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int k=9;
    }
    public static int []solution(int arr[], int k){
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            int sum=arr[i]+arr[j];
            if(sum<k){
                i++;
            }
            else if(sum>k){
                j--;
            }
            else{
                return new int[]{i+1, j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
