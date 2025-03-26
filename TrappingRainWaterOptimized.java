public class TrappingRainWaterOptimized {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solution(arr));
    }
    public static int solution(int arr[]){
        int total=0;
        int leftMax=0;
        int rightMax=0;
        int l=0;
        int r=arr.length-1;
        while (l<r){
            if(arr[l]<=arr[r]){
                if(leftMax>arr[l]){
                    total+=leftMax-arr[l];
                }
                else{
                    leftMax=arr[l];
                }
                l++;
            }
            else{
                if(rightMax>arr[r]){
                    total+=rightMax-arr[r];
                }
                else{
                    rightMax=arr[r];
                }
                r--;
            }
        }
        return total;
    }
}
