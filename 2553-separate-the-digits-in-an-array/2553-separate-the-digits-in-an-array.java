class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length, digits = 0;
        for ( int num : nums ) {
            int temp = num;
            while ( temp > 0 ) {
                digits++;
                temp /= 10;
            }
        }
        int[] res = new int[digits];
        for ( int i = n - 1; i >= 0; i-- ) {
            while ( nums[i] > 0 ) {
                res[--digits] = nums[i] % 10;
                nums[i] = nums[i]/10;
            }
        }
        return res;
    }
}