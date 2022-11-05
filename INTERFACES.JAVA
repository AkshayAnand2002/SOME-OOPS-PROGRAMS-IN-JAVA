import java.util.*;
import java.io.*;
interface Vehicle{
	void changegear(int a);
	void speedup(int a);
	void applybrakes(int a);
}
class Bicycle implements Vehicle{
	int speed;
	int gear;
	@Override
	public void changegear(int newgear) {
		gear=newgear;
	}
	@Override
	public void speedup(int increment) {
		// TODO Auto-generated method stub
		speed=speed+increment;
		
	}
	@Override
	public void applybrakes(int decrement) {
		// TODO Auto-generated method stub
		speed=speed-decrement;
		
	}
	public void printstates() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
}
class Bike implements Vehicle{
	int speed;
	int gear;
	@Override
	public void changegear(int newgear) {
		gear=newgear;
	}
	@Override
	public void speedup(int increment) {
		// TODO Auto-generated method stub
		speed=speed+increment;
		
	}
	@Override
	public void applybrakes(int decrement) {
		// TODO Auto-generated method stub
		speed=speed-decrement;
		
	}
	public void printstates() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
}
public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle b1=new Bicycle();
		b1.speedup(3);
		b1.changegear(4);
		b1.applybrakes(2);
		b1.printstates();
		Bike b2=new Bike();
		b2.speedup(3);
		b2.applybrakes(2);
		b2.printstates();
	}

}
