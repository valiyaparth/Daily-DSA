import java.util.*;
public class Subarray_sum_divisible_by_k {
    public int subarraysDivByK(int[] nums, int k) {
        Hashtable<Integer, Integer> rem = new Hashtable<>();
        rem.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            prefixSum+=nums[i];
            int r = prefixSum % k;
            if(r<0){
                r=(r+k);
            }
            if(rem.containsKey(r)){
                count+=rem.get(r);
                rem.put(r, rem.get(r)+1);
            }
            else{
                rem.put(r,1);
            }
        }
        return count;
    }
}
