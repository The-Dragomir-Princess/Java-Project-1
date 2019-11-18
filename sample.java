import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

class sample
{	
	public static void main(String args[])
	{
		int age;
	 	String name, address;
		int c=1000;
		int x=0;
		try{
		FileWriter f=new FileWriter("/home/twisha/Desktop/Acount_details.txt");
		BufferedWriter f1 = new BufferedWriter(f);
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your name:");
			name=sc.nextLine();
			System.out.println("Enter your age:");
			age=sc.nextInt();
			System.out.println("Enter your address:");
			address=sc.nextLine();
			c++;
			x++;
			f1.write("Customer"+ x + "Details:");
			f1.newLine();
			f1.write(name);
			f1.newLine();
			f1.write(age);
			f1.newLine();
			f1.write(address);
			f1.newLine();}
		catch(IOException Ex){
		System.out.println(Ex.getMessage());
		}
		
	}
}
