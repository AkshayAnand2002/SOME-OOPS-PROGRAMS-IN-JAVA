/*
The Money Box (Piggy Bank) of a child contains money in different
currencies such as dollars-cents, pounds-pence or rupees-paise. The box
has notes and coins. The Money Box is broken, the note and coin numbers
are counted, and are added based on their value (that is number of 5-rupee
notes, or $1 note etc).
Create classes representing different denomination for notes and coins.
Dollar, and Pound has conversion methods to Rupees which print the total
value in Rupees.
Create a class called PiggyBank that allows entry of these currencies in
terms of number of notes and coins of different denomination. Create a
display method that allows any of these currency types and displays the
total amount collected in terms of Rupees. (Assume1 dollar= Rs. 50 and 1
pound= 78).
*/
package src;
import java.util.*;
 abstract class Currency{
	int notes[] = new int[3];
	int coin[] = new int[2];
	double total;
	public  abstract double conversion();
}
class Dollar extends Currency{
	public double conversion() {
		total = 50*(this.notes[0] + this.notes[1]*10 + this.notes[2]*100) + (this.coin[0] + this.coin[1]*5)*0.5;
		return total;
	}
	public void display() {
		System.out.println("Amount in Dollar: "+total);
	}
	
}
class Pounds extends Currency{

	public double conversion(){
		total=78*(this.notes[0] + this.notes[1]*10 + this.notes[2]*100) + (this.coin[0] + this.coin[1]*5)*0.78;
		return total;
	}
	public void display() {
		System.out.println("Amount in Pounds: "+total);
	}
}
class Rupee extends Currency{
	public double conversion() {
		total = (this.notes[0]*10 + this.notes[1]*100 + this.notes[2]*1000) + (this.coin[0] + this.coin[1]*5);
		return total;
	}
	public void display() {
		System.out.println("Amount in Rupees: "+total);
	}
}
public class Lab7_1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Dollar D = new Dollar();
		Pounds P = new Pounds();
		Rupee R = new Rupee();
		for(int i=0;i<3;i++) {
			System.out.println("Enter the no. of "+Math.pow(10, i) +" Dollar notes");
			D.notes[i] = sc.nextInt();
			sc.nextLine();
		}
			System.out.println("Enter the no. of coins of value 1 cent");
			D.coin[0] = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the no. of coins of value 5 cent");
			D.coin[1] = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<3;i++) {
				System.out.println("Enter the no. of "+Math.pow(10, i) +" Pounds notes");
				P.notes[i] = sc.nextInt();
				sc.nextLine();
			}

			System.out.println("Enter the no. of coins of value 1 pence");
			P.coin[0] = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the no. of coins of value 5 pence");
			P.coin[1] = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<3;i++) {
				System.out.println("Enter the no. of "+Math.pow(10, i+1) +" Rupee notes");
				R.notes[i] = sc.nextInt();
				sc.nextLine();
			}
			System.out.println("Enter the no. of coins of value 1 Rupee");
			R.coin[0] = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the no. of coins of value 5 Rupee");
			R.coin[1] = sc.nextInt();
			sc.nextLine();
			double total = 0;
			total+=D.conversion();
			total+=P.conversion();
			total+=R.conversion();
			System.out.println("Total amount : "+total);
			D.display();
			P.display();
			R.display();
	}
}
