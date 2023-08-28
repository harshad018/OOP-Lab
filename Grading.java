import java.util.*;

class Grading {


    public static void main (String args[]){



	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the marks of first subject: ");

	int a = scan.nextInt();
	System.out.println("Enter the marks of second subject: ");

	int b = scan.nextInt();

	System.out.println("Enter the marks of third subject: ");


	int c = scan.nextInt();


	int t  = a + b + c;

	int p = t/3;


	if ( p >= 65){

	    System.out.println("Distinction");


	}
	else if ( p < 65 && p >= 50){

	    System.out.println("First Class");


	}
	else if ( p >= 45 && p < 50){

	    System.out.println("Pass");


	}else {
	    System.out.println("Fail");

	}

	
			  















    }





















}
