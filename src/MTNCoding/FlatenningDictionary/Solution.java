package MTNCoding.FlatenningDictionary;

import java.util.HashMap;
import java.util.Map;


public class Solution {

    public static void main(String[] args) {
        HashMap<String, Object> dict = new HashMap<>();
        dict.put("key1", "1");
        HashMap<String, Object> c = new HashMap<>();
        c.put("d", "3"); c.put("e", "1");
        HashMap<String, Object> key2 = new HashMap<>();
        key2.put("a", "2"); key2.put("b", "3"); key2.put("c", c);
        dict.put("key2", key2);

        System.out.println(flattenDic("",dict,new HashMap<String,String>()));
    }

    public static HashMap<String,String> flattenDic(String currentKey,HashMap<String, Object> dict,HashMap<String,String> result){

        for (Map.Entry<String,Object> entry: dict.entrySet()){

           if (entry.getValue() instanceof Map){
                //--------> we perform a DFS
                flattenDic(entry.getKey() + currentKey,(HashMap<String, Object>) entry.getValue(),result);

            }
            else {
                //-------> then we add to the result
               if (currentKey.length() > 0){
                   result.put(currentKey+ "."+entry.getKey() , (String) entry.getValue());
               }
               else {
                   result.put(entry.getKey() , (String) entry.getValue());
               }

            }


        }


        return result;

    }
}
