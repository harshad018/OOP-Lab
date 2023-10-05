import java.util.*;
public class Employee {
	String  empname, empmail, empad;
	int empid;
	long mobno;
	double BP, HRA, PF, CF, DA, Grosspay, netpay;
    public String empd;
	
	
	public Employee() {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Employee name");
		empname = scan.nextLine();
		
		System.out.println("Enter the employee Email id");
		empmail = scan.nextLine();
		
		System.out.println("Enter the employee address");
		empad = scan.nextLine();
		
		System.out.println("Enter the employee id");
		empid = scan.nextInt();
		
		
		System.out.println("Enter the employee Mobile no");
		mobno = scan.nextLong();
	
	}
	
	void display() {
		
		DA = 0.97 * BP;
		HRA = 0.1 * BP;
		PF = 0.12 * BP;
		CF = 0.1 * BP;
		
		Grosspay = BP + DA + HRA;
		netpay = Grosspay - ( PF + CF);
		
		
		System.out.println("Employee name: " + empname);
		System.out.println("Employee id: " + empid);
		System.out.println("Employee Email id: " + empmail);
		System.out.println("Employee Address: " + empad);
		System.out.println("Employee Mobile no: " + mobno);
		
		System.out.println ("Employee Gross Salary is: " + Grosspay);
		System.out.println ("Employee Net Salary is: " + netpay);
		
		
		
		
		
		
	}


    public static void main (String args[]) {
	
	
	
	
	int empd;
	
	do { 
	
	System.out.println("Enter the type of employee");
	System.out.println("1.Programmer");
	System.out.println("2.Team Leader");
	System.out.println("3.Assistant Project Manager");
	System.out.println("4.Project Manager");
	System.out.println("5.Exit");
	
	Scanner scan = new Scanner (System.in);
	empd = scan.nextInt();

	switch (empd){
	
	case 1: Employee p = new Programmer(); p.display();
		break;
		
	case 2: Employee t = new teamlead(); t.display();
		break;
		
	case 3: Employee apm = new APM(); apm.display();
		break;
		
	case 4: Employee pm = new PM(); pm.display();
		break;
	
	
	
	
	}
	
	
	}while ( empd < 5);


    }
	
	
}

 class Programmer extends Employee {
    public Programmer(){
	Scanner scan = new Scanner (System.in);
    System.out.println("Enter the basic pay of the programmer");

    BP = scan.nextDouble();

    } 

}


 class teamlead extends Employee {
    public teamlead(){
		Scanner scan = new Scanner (System.in);
    System.out.println("Enter the basic pay of the teamlead");
    BP = scan.nextDouble();
    
    }


}

 class APM extends Employee {
    public APM(){
		Scanner scan = new Scanner (System.in);
     System.out.println("Enter the basic pay of the Assistant Project Manager");
    BP = scan.nextDouble();
    }
}

class PM extends Employee {
    public PM(){

		Scanner scan = new Scanner (System.in);
 System.out.println("Enter the basic pay of the Project Manager");
    BP = scan.nextDouble();
    }

}

