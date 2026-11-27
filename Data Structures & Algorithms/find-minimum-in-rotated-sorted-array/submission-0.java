class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        while(l<n-1){
            if(nums[l]<nums[l+1]) l++;
            else{
                return nums[l+1];
            }
        }
        return nums[0];
    }
}