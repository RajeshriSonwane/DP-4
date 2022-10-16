/*
## Problem 1:(https://leetcode.com/problems/maximal-square/)

Time Complexity :   O (m*n) 
Space Complexity :  O (m*n)
Did this code successfully run on Leetcode :    Yes (221. Maximal Square)
Any problem you faced while coding this :       No
 */
// Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
// Output: 4

class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null)
            return 0;
        
        int max = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        
        for(int i=1; i<= m; i++){
            for(int j=1; j<= n; j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = 1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        return max* max;
    }
}