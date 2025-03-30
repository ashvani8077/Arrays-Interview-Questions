public class NextPermutation {
    public static void main(String[] args) {
        int arr[]={3,1,2};

    }
    public static void solution(int arr[]){
        int n=arr.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,n-1);
            return;
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(arr[i]>arr[index]){
                    int temp=arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                    break;
                }
            }
        }
        reverse(arr,index+1,n-1);
    }
    public static void reverse(int arr[], int i, int j){
        while (i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
