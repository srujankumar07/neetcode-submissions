class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        Arrays.sort(people);
        int res=0;
        int l=0;int r=n-1;
        while(l<=r){
           int rem=limit-people[r];
           r--;
           res++;
           if(l<=r && rem>=people[l]) l++;
        }
        return res;
    }
}