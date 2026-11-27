class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        int ans = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long totalHrs = helper(piles, mid);

            if (totalHrs <= h) {
                ans = mid;      // Valid speed, try finding a smaller one
                r = mid - 1;
            } else {
                l = mid + 1;    // Too slow, increase speed
            }
        }
        return ans;
    }

    private long helper(int[] arr, int speed) {
        long total = 0;
        for (int bananas : arr) {
            total += (bananas + speed - 1L) / speed;
        }
        return total;
    }
}