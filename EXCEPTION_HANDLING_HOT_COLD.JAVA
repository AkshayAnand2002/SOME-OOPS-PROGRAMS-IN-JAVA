/*
 Hot-Cold (Exceptions Handling): Create two user-defined exceptions 
 named “TooHot” and “TooCold” to check the temperature (in 
 Celsius) given by the user passed through the command line 
 is too hot or too cold. If temperature > 35, throw exception 
 “TooHot”. If temperature <5, throw exception “TooCold”. 
 Otherwise, print “Normal” and convert it to Farenheit.
 * */
package src;
import java.io.*;
import java.util.*;
class TooHot extends Exception {
    public String toString(){ 
        return "TooHot" ;
   }
}
class TooCold extends Exception {
    public String toString(){ 
        return "TooCold" ;
   }
}
public class practise12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float tempC = s.nextFloat();
        try {
            if(tempC > 35) {
                throw new TooHot();
            }
            if(tempC < 5) {
                throw new TooCold();
            }
            float tempF = ((tempC*9) / 5) + 32;
            System.out.println("Normal");
            System.out.println(tempF);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
