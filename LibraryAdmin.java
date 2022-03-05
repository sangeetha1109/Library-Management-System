package library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryAdmin {
	private void login()
	{
		// Librarian Login Acess
				System.out.println();
				System.out.println("**********  Admin Login ************");
				Scanner input = new Scanner(System.in);
				String user,pswd;
				
				System.out.println("UserName :");
				user = input.nextLine();
				
				System.out.println("Password");
				pswd = input.nextLine();
				
				if(user.equals("Librarian") && (pswd.equals("admin@123"))) {
					System.out.println("*********** Welcome to Library Management System ***************");
				} else {
					System.out.println("Wrong UserName & Password! Access Dined!");
				}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("********* Welcome to Library Management Project ********");
		System.out.println();
		System.out.println("There is No Friend as a Loyal as a Book!");
		LibraryAdmin a = new LibraryAdmin();
		a.login();
		
		char ch;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Admin choice from 1 to 7");
			System.out.println("");
			System.out.println("--------- Library Module ----------- \n1 Student Entry \n2 Available Books \n3 Searching Book \n4 Issue Books \n5 Return Book Details \n6 Update New Books \n7 Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				LibraryData b = new LibraryData();
				b.studentEntry();
				break;
				
			case 2:
				LibraryData c = new LibraryData();
				c.availableBooks();
				break;
				
			case 3:
				LibraryData i = new LibraryData();
				i.searchBook();
				break;
				
			case 4:
				LibraryData d = new LibraryData();
				d.issueBook();
				break;
				
			case 5:
				LibraryData h = new LibraryData();
				h.returnBook();
				break;
					
			case 6:
				LibraryData f= new LibraryData();
				f.addNewbook();
				break;
			case 7:
				LibraryData g = new LibraryData();
				g.exit();
				break;
				default:
					System.out.println("Invalid Number");
			}
				System.out.println("Do you want to continue(y/n)");
				ch=sc.next().charAt(0);
	}
		while(ch=='y'|| ch=='Y');

	}

 }

class LibraryData
{
	static int bId,Nbook;
	static String Rbook,Idate,bname,name,usId;
	
	
	void studentEntry()
	{
		System.out.println("***Student Entry***");
		System.out.println();
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the Student Name : ");
		name = ob.nextLine();
		System.out.println("University Id :");
		String uId = ob.nextLine();
		System.out.println("Library User Id :");
		usId = ob.nextLine();
		System.out.println("Which Semester Do You Study :");
		int sem = ob.nextInt();
		// Student Entry Display Details
		System.out.println("***Student Entry Details***");
		System.out.println("Enter the Student Name :" +name);
		System.out.println("University Id :" +uId);
		System.out.println("Library User Id :" +usId);
		System.out.println("Which Semester Do You Study :" +sem);
		
	}
	
	void availableBooks()
	{
		System.out.println("***********Available Book List in Library**********");
		System.out.println();
		
		
		String chemistry[] = {"Organic Chemistry","Physical Chemistry","Bio Chemistry","Inorganic Chemistry","Polymer Chemistry"};
		
		System.out.println("-------The Books Available in Chemistry Department------");
		
		for(int i=0; i< chemistry.length;i++) {	
			System.out.println(chemistry[i]);	
		}
		
		
		System.out.println();
		String Physics[] = {"Mechanics", "Dynamics", "Solid State Physics", "Astro Physics", "Electromagnetism"};
		
		System.out.println("-------The Books Available in Physics Department------");
		
		for(int i=0; i< Physics.length;i++) {
			System.out.println(Physics[i]);
		}
		
		System.out.println();
		String Biology[] = {"Zoology", "Botany", "MedicalScience", "Microbiology","Marine Biology", "Molecular Biology", "Ecology"};
		
		System.out.println("-------The Books Available in Biology Department------");
		
		for(int i=0; i< Biology.length;i++) {
			System.out.println(Biology[i]);
		}
	}
	
	void searchBook()
	{
		System.out.println("******* Searching Book  ********");
		System.out.println();
		System.out.println();
		Scanner sb = new Scanner(System.in);
		
		System.out.println("Enter the Search book Name ");
		String bname = sb.nextLine();
		String sBook[] = {"Organic Chemistry","Physical Chemistry","Bio Chemistry","Inorganic Chemistry","Polymer Chemistry","Mechanics", 
				"Dynamics", "Solid State Physics", "Astro Physics", "Electromagnetism","Zoology", "Botany", "MedicalScience", "Microbiology","Marine Biology", "Molecular Biology", "Ecology"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(sBook));
		if (list.contains(bname)) 
		{	
			System.out.println(bname+" is Available"); 
		}		
		else {
			System.out.println(bname+" is not Available"); 
			}
	}
	
	void issueBook()
	{
		System.out.println("**** Issue Books ****");
		Scanner isu = new Scanner(System.in);
		System.out.println("Book Name : ");
		bname = isu.nextLine();
		System.out.println("Book_Id : ");
		bId = isu.nextInt();
		isu.nextLine();
		System.out.println("Issue Date : ");
		Idate = isu.nextLine();
		System.out.println("Total Number of Books Issued  : ");
		Nbook = isu.nextInt();
		isu.nextLine();
		System.out.println("Return Book Date : ");
		Rbook = isu.nextLine();
		
	}
	
	int getid()
	{
		return bId;
	}
	
	void returnBook()
	{
		Scanner rbk = new Scanner(System.in);
		System.out.println("Student Name :");
		name = rbk.nextLine();
		System.out.println("Book Id :");
		int bookId = rbk.nextInt();
		if(bId==bookId)
		{
			System.out.println("*** Return Books Data ****");
			System.out.println();
			
			System.out.println("Student Name :" +LibraryData.name);
			System.out.println("Book Name : " +LibraryData.bname);
			System.out.println("Book_Id : " +LibraryData.bId);
			System.out.println("Issue Date : " +LibraryData.Idate);
			System.out.println("Total Number of Books Issued  : " +LibraryData.Nbook);
			System.out.println("Return Book Date : " +LibraryData.Rbook);
		}
		
		else
		{
			System.out.println("Wrong Book_Id, Please Enter Correct Book_Id");
		}
	}
	
	
	void addNewbook()
	{
		Scanner addN = new Scanner(System.in);
		System.out.println("Book Name :");
		String bkname = addN.nextLine();
		System.out.println("Book Prize :");
		float bp = addN.nextFloat();
		System.out.println("Book NO :");
		int bn = addN.nextInt();
		
		// Updated Books Display
				System.out.println("***New Book Details ***");
				System.out.println();
				
				System.out.println("Book Name :" +bkname);
				System.out.println("Book Prize :" +bp);
				System.out.println("Book NO :" +bn);
	}
	
	void exit()
	{
		
		System.out.println("A Book is Gift, You can open Again and Again!");
		System.out.println();
		System.out.println("******Thank you for visit our page******");
		System.exit(0);
	}
	
}	



