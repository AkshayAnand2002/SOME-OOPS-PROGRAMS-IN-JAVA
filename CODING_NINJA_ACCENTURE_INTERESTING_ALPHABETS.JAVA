//https://www.codingninjas.com/codestudio/problems/interesting-alphabets_893325?leftPanelTab=0
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution {
   public static ArrayList<ArrayList<Character>> interestingPattern(int N)     {
       ArrayList<ArrayList<Character>> finalAns = new ArrayList<ArrayList<Character>>();
       int temp = N;
       for(int i = 1; i <= N; ++i){
           ArrayList<Character> ans = new ArrayList<>(); //for each row create a new ArrayList<>
           for(int j = 1; j <= i; ++j){
               ans.add( (char)( (65 + (N - i) + j - 1) ));
           }
           finalAns.add(ans);  //add that row to the finalArrayList   
       }
       return finalAns;
   }
}
