public class RotateImage {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
    }
    public static void rotate(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<arr[0].length;j++){
                swap(arr,i,j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = temp;
            }
        }
    }
    public static void swap(int arr[][], int i, int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
}
