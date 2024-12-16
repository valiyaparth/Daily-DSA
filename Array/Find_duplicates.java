import java.util.*;

public class Find_duplicates {
    public List<Integer> findDuplicates(int[] nums) {
        Hashtable<Integer, Integer> freq = new Hashtable<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
                freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        
       for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
        if(entry.getValue()>1){
            ans.add(entry.getKey());
        }
       }

        return ans;
    }
}
