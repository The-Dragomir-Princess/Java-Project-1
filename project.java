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
		
		FileWriter f=new FileWriter("/home/twisha/Desktop/Project/Acount_details.txt",true);
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
	public void deposit() throws IOException
       {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the date:");
       date=sc.nextLine();
       System.out.println("Enter your account number:");
       number=sc.nextInt();
       System.out.println("Enter the amount to be deposited:");
       amt=sc.nextInt();
       System.out.println("Processing request");
       cust_bal= cust_bal+amt;
       System.out.println("Request processed"+"\n Remaining balance in account:"+cust_bal);
       FileWriter fn=new FileWriter("/home/twisha/Desktop/Project/deposit_log.txt",true);
		BufferedWriter bn = new BufferedWriter(fn);
		bn.write("Account " + number+ "	|");
		bn.write("|		" +date + "		");
		bn.write("|		" +amt + "		");
		bn.write("|		" +cust_bal + "		");
		bn.newLine();
		bn.close();
		fn.close();
       }
	
	public void withdraw() throws IOException
       {
		    Scanner sc= new Scanner(System.in);
		    System.out.println("Enter the date:");
		   date=sc.nextLine();
		   System.out.println("Enter your account number:");
		   number=sc.nextInt();
		   System.out.println("Enter the amount to be withdrawn:");
		   if(amt>cust_bal)
		   		System.out.println("Insufficient funds");
		   else
			   {
			   System.out.println("Processing request");
			   
			   		cust_bal=cust_bal-amt;
			   }
			 FileWriter f2=new FileWriter("/home/twisha/Desktop/Project/Withdraw_log.txt",true);
			BufferedWriter b2 = new BufferedWriter(f2);
			b2.write("Account " + number+ "	|");
			b2.write("|		" +date + "		");
			b2.write("|		" +amt + "		");
			b2.write("|		" +cust_bal + "		");
			b2.newLine();
			b2.close();
			f2.close();
			}
