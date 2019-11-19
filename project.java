import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

class banking
{	
		String age;
	 	String name;
	 	String a;
		int c=1000;
		
			
		
		public void Create_Account()	throws IOException
		{
		
		FileWriter f=new FileWriter("/home/twisha/Desktop/Project/Acount_details.txt");
		BufferedWriter f1 = new BufferedWriter(f);
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your name:");
			name=sc.nextLine();
			System.out.println("Enter your age:");
			age=sc.nextLine();
			System.out.println("Enter your address:");
			a=sc.nextLine();
			c++;
			
			f1.write("Customer Details:");
			f1.write("  ");
			f1.write(" ");
			f1.newLine();
			f1.write("Account" + c);
			f1.newLine();
			f1.write(name);
			f1.newLine();
			f1.write(age);
			f1.newLine();
			f1.write(a);
			
			f1.newLine();
			f1.close();
			f.close();
		
		}
	
	
	
