/*
 Create an abstract class MotorVehicle with the following details:
    (a) Data Members:
        i. modelName
        ii. modelNumber
        iii. modelPrice
    (b) Methods: display() to show all the details
Create a subclass of this class Car that inherits the class MotorVehicle 
and add the following details:
    (a) Data Members: discountRate
    (b) Methods:
        i. display() method to display the Car name, model number, price and 
        the discount rate.
        ii. discount() method to compute the discount
 * */
package src;
abstract class MotorVehicle{
	protected String modelName;
	protected long modelNumber;
	protected double modelPrice;
	public MotorVehicle(String modelName,long modelNumber,double modelPrice) {
		this.modelName=modelName;
		this.modelNumber=modelNumber;
		this.modelPrice=modelPrice;
	}
	abstract public void display();
}
class Car1 extends MotorVehicle {
    double discountRate;
    public Car1(String modelName, long modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }
    public void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model number: " + modelNumber);
        System.out.println("Model price: " + modelPrice);

    }
    public void discount() {
        double discountedPrice = modelPrice * (1 - (discountRate / 100));
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
public class practise4 {

	public static void main(String[] args) {
		Car1 c = new Car1("Tata Nano", 231423543141l, 350000, 4.5);
        c.display();
        c.discount();
	}

}
