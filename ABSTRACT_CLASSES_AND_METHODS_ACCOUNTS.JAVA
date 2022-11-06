/*
 Create an abstract class Accounts with the following details:
    (a) Data Members:
        i. Balance
        ii. accountNumber
        iii. accountHoldersName
        iv. address
    (b) Methods:
        i. withdrawl() - abstract
        ii. deposit() - abstract
        iii. display() - to show the balance of the account number
Create a subclass of this class SavingsAccount and add the following details:
    (a) Data Members: rateOfInterest
    (b) Methods: calculateAmount()
 * */
package src;
abstract class Account{
	double balance;
	long accountNumber;
	String accountHoldersName,address;
	abstract public void withdraw(double amt);
	abstract public void deposit(double amt);
	public Account(double balance,long accountNumber,String accountHoldersName,String address) {
		this.balance=balance;
		this.accountNumber=accountNumber;
		this.accountHoldersName=accountHoldersName;
		this.address=address;
	}
	public void display() {
		System.out.println("Account no.: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}
class SavingsAccount extends Account {
    double rateOfInterest;
    public SavingsAccount(double balance, long accountNumber, String accountHoldersName, String address,
            double rateOfInterest) {
        super(balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;
    }
    public void withdraw(double amt) {
        balance -= amt;
    }
    public void deposit(double amt) {
        balance += amt;
    }
    public double calculateAmount(int time) {
        double amount = balance + (balance * rateOfInterest * time) / 100;
        return amount;
    }
}
public class practise2 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(10000, 2345367263843l, "Abhishek", "Red Road", 8.5);
        sa.withdraw(500);
        sa.deposit(1000);
        sa.display();
        System.out.println("Amount: " + sa.calculateAmount(2));
    }
}
