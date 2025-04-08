public class FindPivotIndex {
    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
    }
    public static int solution(int arr[]){
        int total=0;
        for(int i:arr){
            total=total+i;
        }
        int cs=0;
        for(int i=0;i<arr.length;i++){
            if (cs == total - cs - arr[i]) {
                return i;
            }
            cs=cs+arr[i];
        }
        return -1;
    }
}
