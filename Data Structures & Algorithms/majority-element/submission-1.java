class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> res=new HashMap<>();
        for(int num : nums){
            int cnt=res.getOrDefault(num,0)+1;
            res.put(num, cnt);
            if(cnt>n/2) return num;
        }
        return -1;
    }
}