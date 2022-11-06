/*
 Student Examination (Exception Handling): Consider a Student 
 examination database system that prints the mark sheet of 
 students. Input the following from the command line. 
 (a) Student’s Name (b) Marks in six subjects. These marks 
 should be between 0 to 50. If the marks are not in the specified
  range, raise a RangeException, else find the total marks and 
  prints the percentage of the students.
 * */
package src;
import java.io.*;
import java.util.*;
public class practise11 {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner s = new Scanner(System.in);
        String name;
        int [] marks = new int[6];
        int sum = 0;
        
        try {
            name = s.nextLine();
            for(int i=0; i<6; i++) {
                marks[i] = s.nextInt();
                if (marks[i]<0 || marks[i]>50) {
                    throw new IllegalArgumentException();
                }
                sum += marks[i];
            }
            System.out.println(sum);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
