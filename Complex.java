import java.util.*;
class Complex {

    public static void main (String args[]){


	int i , r;
	int ch;


	Scanner scan = new Scanner (System.in);

	Complexop c = new Complexop();

	System.out.println("Enter the first complex number: ");

	System.out.println("Enter the real part: ");
	r = scan.nextInt();
	System.out.println("Enter the imaginary  part: ");
	i = scan.nextInt();

	Complexop ob1 = new Complexop(r,i);


	System.out.println("Enter the second complex number: ");

	System.out.println("Enter the real part: ");
	r = scan.nextInt();
	System.out.println("Enter the imaginary  part: ");
	i = scan.nextInt();

	Complexop ob2 = new Complexop(r,i);



	do {

	    System.out.println("1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide \n 5.Exit \n Enter Your Choice");

	    ch = scan.nextInt();


	    switch(ch){

	    case 1:
		c.Addition(ob1,ob2);
		break;


	    case 2:
			c.Subtraction(ob1,ob2);
	    break;


	    case 3:
			c.Multiplication(ob1, ob2);
	    break;


	    case 4:
		c.Division(ob1,ob2);
	    break;
	    
	
	    }


	
	}while (ch <= 4);



    }




}

class Complexop{

    float real, imag;


    Complexop(){

	real = 0;
	imag = 0;


    }

    Complexop (float real,float  imag){

	this.real = real;
	this.imag = imag;


    }


    void Addition (Complexop c1,Complexop c2){

	this.real = c1.real + c2.real;
	this.imag = c1.imag + c2.imag;


	System.out.println("Addition is: " + this.real + "+" + this.imag + "i");



    }


    void Subtraction ( Complexop c1 , Complexop c2){


	this.real = c1.real - c2.real;
	this.imag = c1.imag - c2.imag;

	System.out.println("Subtraction is: " + this.real + "+" + this.imag + "i");
	



    }

    void Multiplication ( Complexop c1, Complexop c2){

	this.real = (c1.real * c2.real) - ( c1.imag * c2.imag);
	this.imag = (c1.real * c2.imag) + ( c1.imag * c2.real);

	System.out.println("Multiplication is " + this.real + "+" + this.imag + "i");



    }


    void Division ( Complexop c1, Complexop c2){

	this.real = ((c1.real)*(c2.real) + (c1.imag)*(c2.imag))/((c2.real)*(c2.real) + (c2.imag)*(c2.imag));
	this.imag = ((c1.imag)*(c2.real) - (c1.real)*(c2.imag))/((c2.real)*(c2.real) + (c2.imag)*(c2.imag));

       	System.out.println("Division is " + this.real + "+" + this.imag + "i");


    }
      

}
