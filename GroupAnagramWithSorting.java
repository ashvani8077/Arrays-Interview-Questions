import java.util.HashMap;
import java.util.*;

public class GroupAnagramWithSorting {
    public static void main(String[] args) {
        String str[]={"eat","tea","tan","ate","nat","bat"};

    }
    public static List<List<String>>solution(String str[]){
        HashMap<String,List<String>>mp=new HashMap<>();
        for(String temp:str){
            char []charArray=temp.toCharArray();
            Arrays.sort(charArray);
            String sortedStr=new String(charArray);
            if(!mp.containsKey(sortedStr)){
                mp.put(sortedStr,new ArrayList<>());
            }
            mp.get(sortedStr).add(temp);
        }
        return new ArrayList<>(mp.values());
    }
}
