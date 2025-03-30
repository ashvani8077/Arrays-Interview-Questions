public class ContainerIWithMostWater {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
    }
    public static int solution(int arr[]){
        int area=0;
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int newArea=(j-i)*Math.min(arr[i],arr[j]);
            area=Math.max(area,newArea);
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return area;
    }
}
