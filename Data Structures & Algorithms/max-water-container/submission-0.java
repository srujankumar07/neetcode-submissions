class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxWater=0;
        int lp=0;
        int rp=n-1;
        while(lp<rp){
                int width=rp-lp;
                int ht=Math.min(height[lp],height[rp]);
                int area=ht*width;
                maxWater=Math.max(maxWater,area);
                if(height[lp]<height[rp]) lp++;
                else rp--;
        }
        return maxWater;
    }
}