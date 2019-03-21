package com.evry.domain;

import java.util.Scanner;
public class WelcomeBanking {

		

	void accessTypeSelection() {
		char option='\0';
		Scanner scn=new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("WELCOME TO EVRY BANKING SERVICES");
		System.out.println("------------------------------------");
		System.out.println("A. ADMIN");
		System.out.println("B. CUSTOMER");
		System.out.println("C. EXIT");
		
		
		do {
			System.out.println("**********************************************");
			System.out.println("Enter an option");
			System.out.println("**********************************************");
			option= scn.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A':
				callAdminMethoad();
				break;
				
			case 'B':
				callCustomerMethod();
				break;
				
			case 'C':
				break;
				
			default:
				System.out.println("Invalid Option !! Please Enter Again !!");
				break;
			}
		}while(option != 'C') ;
		{
			System.out.println("Thank you for banking with us !!! ");
			
		}
	}
	
	
	private void callAdminMethoad() {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		BankMain callBankingObj= new BankMain();
        
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if (username.equals("admin") && password.equals("@123")) {
			System.out.println("**********************");
			System.out.println("WELCOME ADMIN");
			System.out.println("**********************");
			callBankingObj.adminOperation();
			

		} else {
			System.out.println("Invalid User !!!");
		}
		
		
		
	}
	private void callCustomerMethod() {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
			BankMain callBankingObj= new BankMain();
			System.out.println("Enter username");
			String username = sc.next();
			System.out.println("Enter password");
			String password = sc.next();
			if (username.equals("user") && password.equals("1234")) {
				System.out.println("**********************");
				System.out.println("WELCOME TO EVRY BANKING SERVICE");
				System.out.println("**********************");
				callBankingObj.customerOperation();
				

			} else {
				System.out.println("Invalid User !!!");
			}
		
		
	}


	public static void main(String[] args) {
		WelcomeBanking wc = new WelcomeBanking();
		wc.accessTypeSelection();
		 wc.callAdminMethoad();
		 wc.callCustomerMethod();
	}
	 
	 

	
}


