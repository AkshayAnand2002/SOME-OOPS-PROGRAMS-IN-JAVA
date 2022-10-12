//https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            l.add(in.nextInt());
        }
        int q=in.nextInt();
        for(int i=0;i<q;i++)
        {
            String st=in.next();
            if(st.equals("Insert"))
            {
                l.add(in.nextInt(),in.nextInt());
            }
            else
            {
                l.remove(in.nextInt());
            }
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i));
            System.out.print(" ");
            
        }
    }
}
