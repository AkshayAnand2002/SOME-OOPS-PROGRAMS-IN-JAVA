//https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Number of rows
        int N = in.nextInt();
        // Create a 2D ArrayList to store the value
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        // Initialize the row of the 2D array
        for (int i = 0; i < N; i++){
            list.add(new ArrayList<Integer>());
            // Number of columns
            int C = in.nextInt();
            // Store the value to each column
            for (int j = 0; j < C; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        // Number of queries
        int Q = in.nextInt();
        for (int i = 0; i < Q; i++) {
            // Row and Column number from the queries
            int row = in.nextInt();
            int col = in.nextInt();
            /*
            If queries for the row is larger than N and col in a particular row is also
            out of bounds then print "Error!"
             */
            try{
                System.out.println(list.get(row - 1).get(col - 1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}
