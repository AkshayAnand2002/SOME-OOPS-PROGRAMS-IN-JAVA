//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Solution {
    static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
     b = b.toLowerCase();
    char[] arr = a.toCharArray(); 
    char[] arr1 = b.toCharArray();
    Arrays.sort(arr);
    Arrays.sort(arr1);
    boolean res=false;
    if (Arrays.equals(arr,arr1)){
        res=true;
    }
    else
    res=false;
    return res;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}
