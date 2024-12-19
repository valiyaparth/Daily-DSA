public class Jump_game {
    public boolean canJump(int[] nums) {
        int g = nums.length-1;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i]+i >= g){
                g=i;
            }
        }
        return g == 0;
    }
}
