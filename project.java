import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

class banking
{	
	int age;
 	String name, address;
	static int c=1000;
	FileWriter f=new FileWriter(fileName:"/home/twisha/Desktop/Acount_details.txt")
	public void Create_account()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your age:");
		age=sc.nextInt();
		System.out.println("Enter your age:");
		age=sc.nextInt();
		System.out.println("Enter your address:");
		address=sc.nextLine();
		
		
