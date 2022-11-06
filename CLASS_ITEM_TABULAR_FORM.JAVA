/*
 Write a program to define a class Item containing code and price. 
 Accept this data for five objects using array of objects. 
 Display code, price in tabular form and also, display total 
 price of all items.
 * */
package src;
import java.util.Scanner;

class Item {
    private int code;
    private double price;

    public Item(int code, double price) {
        this.code = code;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public double getprice() {
        return price;
    }
}

public class practise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item items[] = new Item[5];

        System.out.println("Enter details of 5 Items");
        for (int i = 0; i < items.length; i++) {
            System.out.print("Enter Code: ");
            int code = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            items[i] = new Item(code, price);
        }

        double total = 0;

        System.out.println("\nCode\tPrice");
        System.out.println("-----------------");
        for (Item i : items) {
            System.out.println(i.getCode() + "\t" + i.getprice());
            total += i.getprice();
        }
        System.out.println("-----------------");
        System.out.println("Total: " + total);

        sc.close();
    }
}
