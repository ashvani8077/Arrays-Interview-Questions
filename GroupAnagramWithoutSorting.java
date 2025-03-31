import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramWithoutSorting {
    public static void main(String[] args) {
        String str[]={"eat","tea","tan","ate","nat","bat"};
    }
    public static List<List<String>>solution (String []str){
        int n=str.length;
        HashMap<String, List<String>>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            String word=str[i];
            String newWord=generate(word);
            if(!mp.containsKey(newWord)){
                mp.put(newWord, new ArrayList<>());
            }
            mp.get(newWord).add(word);
        }
        return new ArrayList<>(mp.values());
    }
    public static String generate(String word){
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        }
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newWord.append((char) (i + 'a')).append(arr[i]);
            }
        }
        return newWord.toString();
    }
}
