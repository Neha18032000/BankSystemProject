package bankapp;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);    
	     System.out.print("How many number of customers do you want to input: ");  
	     int n=sc.nextInt();  
	     Bank B[]=new Bank[n];  
	      for (int i=0; i<B.length; i++) 
	      {  
	           B[i]=new Bank();  
	           B[i].openAccount();  
	       }
	       int choice;  
	       do {
	    	   
	           System.out.println("\n************Simple Banking Application***********");  
	           System.out.println("1.        Display all account details");
	           System.out.println("2.        Search by Account number");
	           System.out.println("3.        Deposit the amount");
	           System.out.println("4.        Withdraw the amount");
	           System.out.println("5.        Exit");
	           System.out.println("Enter your choice: ");  
	           choice = sc.nextInt();
	           switch (choice) {
	           case 1:
	        	   for (int i=0; i<B.length; i++) 
                   {  
                       B[i].showAccount();  
                   }  
                   break;
	           case 2:
	        	   System.out.print("Enter account number you want to search: ");  
                   String ac_no = sc.next();  
                   boolean found = false;  
                   for (int i=0; i<B.length; i++) 
                   {  
                       found=B[i].search(ac_no);  
                       if (found) 
                       {  
                           break;  
                       }  
                   }  
                   if (!found) 
                   {  
                       System.out.println("Search failed! Account doesn't exist..!!");  
                   }  
                   break;
	           case 3:
	        	   System.out.print("Enter Account no : ");  
                   ac_no=sc.next();  
                   found = false;  
                   for (int i=0;i<B.length; i++) 
                   {  
                       found=B[i].search(ac_no);  
                       if (found) 
                       {  
                           B[i].deposit();  
                           break;  
                       }  
                   }  
                   if (!found) 
                   {  
                       System.out.println("Searching failed!! Account doesn't exist..!!");  
                   }  
                   break;  
	           case 4:
	        	   System.out.print("Enter Account No : ");  
                   ac_no = sc.next();  
                   found = false;  
                   for (int i=0; i<B.length; i++) 
                   {  
                       found=B[i].search(ac_no);  
                       if (found) 
                       {  
                           B[i].withdraw();  
                           break;  
                       }  
                   }  
                   if (!found) 
                   {  
                       System.out.println("Searching failed!! Account doesn't exist..!!");  
                   }  
                   break; 
	           case 5:
	        	   System.out.println("*****Exit*****");  
                   break;           
	                }  
	            }  
	            while (choice!= 5);  

	}

}
