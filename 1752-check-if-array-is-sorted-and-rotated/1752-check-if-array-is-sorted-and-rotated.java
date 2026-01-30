class Solution {
    public boolean check(int[] nums) {
        int n = nums.length, cnt = 0;
        if ( n <= 1 ) return true;
        for ( int  i = 1; i < nums.length; i++ ) {
            if ( nums[i] < nums[i-1] ) {
                cnt++;
            }
        }
        if ( nums[0] < nums[n-1] ) {
            cnt++;
        }
        return cnt <= 1;
    }
}