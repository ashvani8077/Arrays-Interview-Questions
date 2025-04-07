import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagonalTraversal {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int ans[]=solution(arr);
        for (int i:ans){
            System.out.println(i);
        }
    }
    public static int [] solution(int arr[][]){
        HashMap<Integer, List<Integer>>mp=new HashMap<>();
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(!mp.containsKey(j+i)){
                    mp.put(j+i, new ArrayList<>());
                }
                mp.get(j+i).add(arr[i][j]);
            }
        }
        int ans[]=new int[m*n];
        int k=0;
        for(Map.Entry<Integer,List<Integer>>entry:mp.entrySet()){
            int key= entry.getKey();
            List<Integer>li=entry.getValue();
            if(key%2!=0){
                for(int i=0;i<li.size();i++){
                    ans[k]=li.get(i);
                    k++;
                }
            }
            else{
                for(int i=li.size()-1;i>=0;i--){
                    ans[k]=li.get(i);
                    k++;
                }
            }
        }
        return ans;
    }
}
