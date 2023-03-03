package bankapp;

import java.util.Scanner;

public class Bank { 
	    private String name;  
	    private String account_type;
	    private String account_no; 
	    private int balance;  
	    Scanner sc = new Scanner(System.in);  
	      
	    public void openAccount() {  
	        System.out.print("Enter Account Number: ");  
	        account_no = sc.next();  
	        System.out.print("Enter Name: ");  
	        name = sc.next();
	        System.out.print("Enter Account type: ");  
	        account_type = sc.next();  
	        System.out.print("Enter Balance: ");  
	        balance = sc.nextInt();  
	    }  
	    public void showAccount() {  
	        System.out.println("Name of account holder is: " + name);  
	        System.out.println("Account no is: " + account_no);  
	        System.out.println("Account type is: " + account_type);  
	        System.out.println("Current Balance is: " + balance); 
	       
	    	
	    }  
	    public void deposit() {  
	        int amount;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amount=sc.nextInt();  
	        balance=balance+amount;  
	    }  
	    public void withdraw() {  
	        int amount;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amount=sc.nextInt();  
	        if (balance>=amount) {  
	            balance=balance-amount;  
	            System.out.println("BALANCE AFTER WITHDRAW IS: " + balance);  
	        } else {  
	            System.out.println("Your balance is less than " +amount+ "\tTransaction failed...!!" );  
	        }  
	    }  
	    public boolean search(String ac_no) {  
	        if (account_no.equals(ac_no)) {  
	            showAccount();  
	            return (true);  
	        }  
	        return (false);  

	    }
}
