import java.io.*;
import java.util.Scanner;

class Studrec {

	static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

	public static void main(String args[]) throws IOException{
	
		Studrec sr = new Studrec();
		int ch;
		do {
			System.out.println("******************************Menu***************************");
			System.out.print("1.Add record \n2.Display record \n3.delete record \n4.Update record \n5.clear record \n6.search record \n7.Exit \nEnter your choice: " );
			
			
			 ch = Integer.parseInt(br.readLine());
			
			switch(ch){
			
				case 1: sr.addRec();
				break;
				
				case 2: sr.displayrec();
				break;
				
				case 3: sr.deleterec();
				break;
				
				case 4:sr.updaterec();		
				break;
				
				case 5:sr.clearrec();
				break;
				
				case 6: sr. search();
				break;
				
				
			
			}
		
		
		} while ( ch < 7);
		
	
	}

void addRec() throws IOException {
	
		PrintWriter pw = new PrintWriter( new BufferedWriter( new FileWriter("Studrec.txt",true)));
		
		String name, sclass, addr;
		
		int rollno, marks, sid;
		
		System.out.println("Enter name,sid,rollno,addr,sclass,marks: ");
		
		name = br.readLine();
		sid = Integer.parseInt(br.readLine());
		rollno = Integer.parseInt(br.readLine());
		addr = br.readLine();
		sclass = br.readLine();
		
		
		marks = Integer.parseInt(br.readLine());
		
		
		pw.println(name + " " + sid+" " + rollno+" "+addr+" "+sclass+" "+marks);
		
		System.out.println("Record added successfully");
		pw.close();
		
		
	}
	
void displayrec() throws IOException{

	try{
	
		BufferedReader file = new BufferedReader(new FileReader("Studrec.txt"));
		
		String rec;
		
		while ( (rec = file.readLine()) != null){
		
			System.out.println(rec);
			System.out.println("");
		
		}
	
		file.close();
	
	}
	
	catch (FileNotFoundException e){
	
		System.out.println(e);
	
	}


}

void clearrec() throws IOException {

	PrintWriter pw = new PrintWriter( new BufferedWriter( new FileWriter("Studrec.txt")));
	
	pw.close();
	
	System.out.println("All the data cleared out successfully");

}

void deleterec() throws IOException {

	try{
	
		BufferedReader f1 = new BufferedReader( new FileReader ("Studrec.txt"));
		
		PrintWriter pw = new PrintWriter( new BufferedWriter( new FileWriter("new.txt")));
		String rec; int flag = 0;
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter the student name that you want to delete: ");
		String searchname = s.next();
		while ( (rec = f1.readLine()) != null){
		
			String [] line = rec.split(" ");
			
			if ( !searchname.equalsIgnoreCase(line[0])){
			
				pw.println(rec);
				flag =0;
			
			}
			else{
			
				System.out.println("Record deleted successfully");
				flag =1;
			}
		
		
		
		}
	
		f1.close();
		pw.close();
		
		File delfile = new File("Studrec.txt");
		File oldfile = new File("new.txt");
		File newfile =  new File("Studrec.txt");
		
		if ( delfile.delete()){
		
			System.out.println("Old file deleted successfully");
		}
		else {
		
			System.out.println("Error Occured during the process");
		}
		
		if ( oldfile.renameTo(newfile)){
		
			System.out.println("File renamed successfully");
		}
		else{
			System.out.println("Error occured during the process");
		}
	
	
	}
	
	catch( FileNotFoundException e){
	
		System.out.println(e);
	}
			
	

}

void search() throws IOException{

	try{
	
		BufferedReader f1 = new BufferedReader( new FileReader ("Studrec.txt"));
		
		
		String rec; 
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter the student name that you want to search: ");
		String searchname = s.next();
		while ( (rec = f1.readLine()) != null){
		
			String [] line = rec.split(" ");
			
			if ( searchname.equalsIgnoreCase(line[0])){
			
				System.out.println(rec);
				System.out.println("FOUND");
			}
			
			
	}
	
	}
	catch(FileNotFoundException e){
	
		System.out.println(e);
	}



}

void updaterec() throws IOException{

	try{
	
		BufferedReader f1 = new BufferedReader( new FileReader ("Studrec.txt"));
		
		PrintWriter pw = new PrintWriter( new BufferedWriter( new FileWriter("new.txt")));
		String rec; int flag = 0;
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter the student name that you want to update: ");
		String searchname = s.next();
		while ( (rec = f1.readLine()) != null){
		
			String [] line = rec.split(" ");
			
			if ( !searchname.equalsIgnoreCase(line[0])){
			
				pw.println(rec);
				flag =0;
			
			}
			else{
				System.out.println("Record Found");
				System.out.println("Enter updated marks");
				String upmarks = s.next();
				pw.println(line[0]+" " + line[1]+" " + line[2] + " " + line[3] + " " + line[4]+ " " + upmarks);
				flag = 1;
			}
		
		
		
		}
		f1.close();
		pw.close();
		
		File delfile = new File("Studrec.txt");
		File oldfile = new File("new.txt");
		File newfile =  new File("Studrec.txt");
		
		if ( delfile.delete()){
		
			System.out.println("Old file deleted successfully");
		}
		else {
		
			System.out.println("Error Occured during the process");
		}
		
		if ( oldfile.renameTo(newfile)){
		
			System.out.println("File renamed successfully");
		}
		else{
			System.out.println("Error occured during the process");
		}
	
		}
		catch ( FileNotFoundException e){
		
			System.out.println(e);
		}





}
}
