public class Move_zeroes{
    public void moveZeroes(int[] nums) {
        int left=0, right=0;
        for(int i=0; i<nums.length; i++){
            if(nums[right] != 0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right++;
                left++;
            }
            else{
                right++;

            }
        }
    }
}