import java.util.*;

abstract class Shape {

    double b;
    double h;

    abstract void  ComputeArea();

    void getShapeData(){

	Scanner scan = new Scanner (System.in);
	System.out.println("Enter height of given shape: ");
	h = scan.nextDouble();

	System.out.println("Enter the width of given shape: ");
	b = scan.nextDouble();



    }



}

class Triangle extends Shape {

    void ComputeArea(){

	double A = b*h/2;

	System.out.println("Area of triangle is: " + A);

    }


}

class Rectangle extends Shape {
    void ComputeArea(){
	double a;
	a = b*h;
	System.out.println("The area of rectangle is: " + a);
    }


}

class AbstractClass {


    public static void main ( String args[]) {

	Shape t = new Triangle();
	t.getShapeData();
	t.ComputeArea();


	Shape r = new Rectangle();
	r.getShapeData();
	r.ComputeArea();


    }





}
