import java.util.*;
class Quadrilateral {
private int a1,a2,a3,a4,b1,b2,b3,b4;
Quadrilateral(int a1,int a2,int a3,int a4,int b1,int b2,int b3,int b4){
this.a1=a1;
this.b1=b1;
this.a2=a2;
this.b2=b2;
this.a3=a3;
this.b3=b3;
this.a4=a4;
this.b4=b4;
}
public int geta1() {
return this.a1;
}
public int geta2() {
return this.a2;
}
public int geta3() {
return this.a3;
}
public int geta4() {
return this.a4;
}
public int getb1() {
return this.b1;
}
public int getb2() {
return this.b2;
}
public int getb3() {
return this.b3;
}
public int getb4() {
return this.b4;
}
}
class Rectangle extends Quadrilateral{
//private int a1,a2,a3,a4,b1,b2,b3,b4;
Rectangle(int a1, int a2, int a3, int a4,int b1, int b2,int b3, int b4) {
super(a1, a2, a3,a4,b1, b2,b3,b4);
// TODO Auto-generated constructor stub
}
double d1=Math.sqrt((geta2()-geta1())*(geta2()-geta1())+(getb2()-getb1())*(getb2()-getb1()));
double d2=Math.sqrt((geta3()-geta2())*(geta3()-geta2())+(getb3()-getb2())*(getb3()-getb2()));
double d=d1*d2;
public void getarea() {
System.out.println("Area of Rectangle: "+d);
}

}

class Parallelogram extends Quadrilateral
{
public Parallelogram(int a1, int a2, int a3, int a4, int b1, int b2, int b3, int b4)
{
super(a1, a2, a3,a4,b1,b2,b3,b4);
}

double b = Math.sqrt(((geta1() - geta2())*(geta1() - geta2())) + ((getb1()- getb2())*(getb2()- getb1())));

public  void getareap(int h)
{
System.out.println("Area of parallelogram is:" + b*h);
}
}
class trapezoid extends Quadrilateral
{
public trapezoid(int a1, int a2, int a3, int a4, int b1, int b2, int b3, int b4)
{
super(a1, a2, a3,a4,b1,b2,b3,b4);
}

double s1 = Math.sqrt(((geta1() - geta2())*(geta1() - geta2())) + ((getb1()- getb2())*(getb1()- getb2())));
double s2 = Math.sqrt(((geta3() - geta4())*(geta3() - geta4())) + ((getb3()- getb4())*(getb3()- getb4())));

public void getareat(int h)
{
double A;
A = 0.5 * h * (s1+s2);

System.out.println("Area of Trapezoid is: " + A);
}
}
class Square extends Quadrilateral{
//private int a1,a2,a3,a4,b1,b2,b3,b4;
Square(int a1, int a2, int a3, int a4,int b1, int b2,int b3, int b4) {
super(a1, a2, a3,a4,b1, b2,b3,b4);
// TODO Auto-generated constructor stub
}
double side=Math.sqrt((geta2()-geta1())*(geta2()-geta1())+(getb2()-getb1())*(getb2()-getb1()));
double sq=side*side;
public void getarea() {
System.out.println("Area of Square: "+sq);
}

}
public class lab {

public static void main(String[] args) {
// TODO Auto-generated method stub
//Quadrilateral q = new Quadrilateral();
Parallelogram p1 = new Parallelogram(0,7,7,0,7,7,0,0);
p1.getareap(7);
Rectangle p = new Rectangle(0,7,7,0,7,7,0,0);
p.getarea();
trapezoid t= new trapezoid(1,1,2,1,4,0,0,0);
t.getareat(1);
Square sq=new Square(0,7,7,0,7,7,0,0);
sq.getarea();
}
}
