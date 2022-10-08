//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {
    public static int getPow(int num, int pow){
        if(pow<0){
            int res=1;
            for(int i=1; i<=pow; i++){
                res = res*num;
            }
            return 1/res;
        }
        if(pow>=1){
            int res=1;
            for(int i=1; i<=pow; i++){
                res = res*num;
            }
            return res;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int sum = a;
            for(int j=0; j<n; j++){
                //formula here
                int power = getPow(2, j);
                sum = sum + (power*b);
                System.out.printf("%d ", sum);
            }
            System.out.println("");
        }
    }
}
