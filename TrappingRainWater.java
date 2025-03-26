public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solution(arr));
    }
    public static int solution(int arr[]){
        int n=arr.length;
        int pre[]=pre(n,arr);
        int suff[]=suff(n,arr);
        int total=0;
        for(int i=0;i<arr.length;i++){
            total=total+(Math.min(pre[i],suff[i])-arr[i]);
        }
        return total;
    }
    public static int[]pre(int n,int arr[]){
        int pre[]=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(arr[i],pre[i-1]);
        }
        return pre;
    }
    public static int []suff(int n, int arr[]){
        int suff[]=new int[n];
        suff[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.max(arr[i],suff[i+1]);
        }
        return suff;
    }
}
