import java.io.*;
import java.util.Scanner;

class Studrec {

	static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

	public static void main(String args[]) throws IOException{
	
		Studrec sr = new Studrec();
		int ch;
		do {
		
			System.out.println("1.Add rec \n 2.Display \n 3.delete \n 4.Update rec \n 5.clear rec \n  6.search \n Enter your choice " );
			
			
			 ch = Integer.parseInt(br.readLine());
			
			switch(ch){
			
				case 1: sr.addRec();
				break;
				
				case 2: sr.displayrec();
				break;
				
				/*case 3: sr.deleterec();
				break;
				
				case 4:sr.updaterec();		
				break;
				
				case 5:sr.clearrec();
				break;
				
				case 6: sr. search();
				break;*/
			
			}
		
		
		} while ( ch < 6);
		
	
	}

void addRec() throws IOException {
	
		PrintWriter pw = new PrintWriter( new BufferedWriter( new FileWriter("Studrec.txt",true)));
		
		String name, sclass, addr;
		
		int rollno, marks, sid;
		
		System.out.println("Enter name,sid,rollno,addr,sclass,marks: ");
		
		name = br.readLine();
		sid = Integer.parseInt(br.readLine());
		rollno = Integer.parseInt(br.readLine());
		sclass = br.readLine();
		marks = Integer.parseInt(br.readLine());
		addr = br.readLine();
		
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
}
