package Demo;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class VirtualKeyRepositories {
	void displayfile(){
		String path ="D:\\PhaseOneProject\\VirtualKeyRepositories\\";
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames)
		{
			System.out.println(ff.getName());
			
		}
		
	}
	void addfile() throws IOException{
		String path ="D:\\PhaseOneProject\\VirtualKeyRepositories\\";
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a file name");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//create a new file
		boolean b=f.createNewFile();
		if(b!=true)
		{
			System.out.println("File Not Created");
		}
		else
		{
			System.out.println("File Created");
		}
		
	}
	void deletefile(){
		String path ="D:\\PhaseOneProject\\VirtualKeyRepositories\\";
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a File Name");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("File Gets Deleted");
		
	}
	void searchfile() {
		String path ="D:\\PhaseOneProject\\VirtualKeyRepositories\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Filename to Search");
		String filename=sc.next();
		File f=new File(path);
		//search operation
		int flag=0;
		File filenames[]=f.listFiles();
		for(File ff:filenames)
		{
			if(ff.getName().equals(filename))
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
				
			
		}
		if (flag==1)
		{
			System.out.println("File is found");
		}
		else
		{
			System.out.println("File is not found");
		}
	}
public static void main(String[] args)throws IOException {
	Scanner sc=new Scanner(System.in);
	VirtualKeyRepositories dp=new VirtualKeyRepositories();
	VirtualKeyRepositories p=new VirtualKeyRepositories();
	VirtualKeyRepositories d=new VirtualKeyRepositories();
	VirtualKeyRepositories f=new VirtualKeyRepositories();
	System.out.println("\t**********************\n");
	System.out.println("\tWelcome to Virtual Key Repositories ");
	System.out.println("\t     By, Locker Pvt Ltd. \n");
	System.out.println("\n\t**********************\n");
	while(true){
		System.out.println("Please choose one of the following options :");
		System.out.println("1. List Current Files");
		System.out.println("2. Business Operations");
		System.out.println("3. Close Application");
		System.out.println("Please choose one of the following options :");
		int option1=sc.nextInt();
		switch(option1)
		{
		case 1:System.out.println("Files in Ascending Order");
			dp.displayfile();
		break;
		case 2:while(true) {
			System.out.println("Please choose one of the following options :");
			System.out.println("1. Add a File");
			System.out.println("2. Delete a File");
			System.out.println("3. Search for a File");
			int option2=sc.nextInt();
			switch(option2){
			case 1:p.addfile();break;
			case 2:d.deletefile();break;
			case 3:f.searchfile();break;
			default : System.out.println("\n Opps! Invalid Input,Re-do the process\n");
					 break;
			}
			
		}
		case 3: System.out.println("\n It was nice having you here! See you again. Good bye...");
				System.exit(0);
		        break;
		default:
			System.out.println("\n\n Opps! Invalid Input, Select within the range of 1-3\n");
			break;
		}
	}
}
}


