package exceptionHandling;
import java.util.*;
public class TrycatchDemo {

	public static void main(String[] args) {
		int num1, num2, res;
		int arr[] = {11,12};
		try {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter two numbers");
		num1 = Integer.parseInt(s.next());
		num2 = Integer.parseInt(s.next());
		
		res = num1/num2;
		
		System.out.println("Div res: "+ res);
		
		arr[20] = 42;
		System.out.println("arr[20] is"+ arr[20]);
		}
		catch(NumberFormatException e) {
			
			System.out.println("Number format exception is: "+ e);
			
		}
		catch (ArithmeticException e) {
			
			System.out.println("Arithmetic exception is: "+ e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Arrya index out of bounds:"+ e);
		}
		finally {
			
			System.out.println("I am in the finally block");
		}
	}

}
