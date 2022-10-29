//https://www.codingninjas.com/codestudio/problems/matrix-is-symmetric_799361?leftPanelTab=1
import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        boolean flag = true;
        for(int i=0; i<matrix.length; i++){
            flag = true;
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j]!=matrix[j][i]){
                    flag = false; 
                    return flag;
                }
            }
        }
      return flag;  
    }
}
