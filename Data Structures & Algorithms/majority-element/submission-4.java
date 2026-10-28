class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int res=0;
        for(int num : nums){
            
            if(cnt==0) res= num;

            if(num==res) {
                cnt++;
            }
            else cnt--;
        }
          return res;  
    }
}