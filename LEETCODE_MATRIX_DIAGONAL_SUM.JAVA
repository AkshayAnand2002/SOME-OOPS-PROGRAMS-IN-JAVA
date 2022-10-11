/*
https://leetcode.com/problems/matrix-diagonal-sum/
*/
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;//gives no. of rows and columns
        for(int i=0;i<n;i++){
            sum+=(mat[i][i]+mat[i][n-1-i]);//mat[i][i] represents elements of primary diagonal.
            //mat[i][n-1-i] represents elements of secondary diagonal.
        }
        if(n%2==0){
            return sum;
        }
        else{
            return sum-mat[n/2][n/2];//AS IN CASE OF ODD NO. OF ELEMENTS THE MIDDLE ELEM OF MATRIX IS ADDED TWICE HENCE SUBTRACTED ONCE.
        }
    }
}
