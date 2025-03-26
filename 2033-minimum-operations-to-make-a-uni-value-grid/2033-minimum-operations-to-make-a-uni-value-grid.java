class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] lsgrid = new int[grid.length*grid[0].length];
        int k = 0, rem = grid[0][0]%x;
        for ( int[] row : grid ) {
            for ( int num : row ) {
                if ( (num % x) != rem ) {
                    return -1;
                }
                lsgrid[k++]= num;
            }
        }
        Arrays.sort(lsgrid);
        int op = 0;
        int mid = lsgrid[lsgrid.length/2];
        for ( int num : lsgrid ) {
            if (num == mid) {
                continue;
            }
            op += (Math.abs(num - mid )/x);
        }
        return op;
    }
}