/*
 Write a program to create a class named Vehicle having protected instance variables 
 regnNumber, speed, color, ownername and a method showData() to show “This is a vehicle class”.
  Inherit the Vehicle class into subclasses named Bus and Car having private instance variables 
  routeNumber in Bus and manufacturerName in Car and both of them having showData() method 
  showing all details of Bus and Car respectively with content of the super class’s showData() 
  method
 * */
package src;
class Vehicle{
	protected int regnNumber,speed;
	protected String color,ownername;
	public Vehicle(int regnNumber,int speed,String color,String ownername) {
		this.regnNumber=regnNumber;
		this.speed=speed;
		this.color=color;
		this.ownername=ownername;
	}
	public void showData() {
		System.out.println("This is Vehicle class.");
	}
}
class Bus extends Vehicle{
	private int routeNumber;
	public Bus(int regnNumber,int speed,String color,String ownername,int routeNumber) {
		super(regnNumber,speed,color,ownername);
		this.routeNumber=routeNumber;
	}
	public void showData(){
		super.showData();
		 System.out.println("Regn Number: " + regnNumber);
	     System.out.println("Speed: " + speed);
	     System.out.println("Color: " + color);
	     System.out.println("Owner Name: " + ownername);
	     System.out.println("Route Number: " + routeNumber);
	}
}
class Car extends Vehicle{
	private String manufactureName;
	public Car(int regnNumber, int speed, String color, String ownername, String manufactureName){
		super(regnNumber,speed,color,ownername);
		this.manufactureName=manufactureName;
	}
	public void showData(){
		super.showData();
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownername);
        System.out.println("Manufacture Name: " + manufactureName);
	}
}
public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b = new Bus(1, 100, "Red", "Ramesh", 13);
        Car c = new Car(2, 200, "Blue", "Karan", "Tata");
        b.showData();
        System.out.println("--------------------------------");
        c.showData();
	}

}
