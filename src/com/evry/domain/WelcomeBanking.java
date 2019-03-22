package com.evry.domain;

import java.util.Scanner;

/**
 * @author srinivas.p
 *
 */
public class WelcomeBanking {

	void accessTypeSelection() {
		boolean endLoop = true;
		Scanner scn = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("WELCOME TO EVRY BANKING SERVICES");
		System.out.println("------------------------------------");
		System.out.println("1. ADMIN");
		System.out.println("2. CUSTOMER");
		System.out.println("3. EXIT");

		while (endLoop) {
			System.out.println("**********************************************");
			System.out.println("Enter an option");
			System.out.println("**********************************************");
			int option;
			option = scn.nextInt();
			System.out.println("\n");

			switch (option) {

			case 1:
				callAdminMethoad();
				break;

			case 2:
				callCustomerMethod();
				break;

			case 3:

				endLoop = false;
				System.out.println("**********************************");
				System.out.println("Thank you ! Please come back again ");
				System.out.println("**********************************");
				break;
			}
		}
	}

	private void callAdminMethoad() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AdminProcess callAdminObj = new AdminProcess();
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if (username.equals("admin") && password.equals("@123")) {
			System.out.println("**********************");
			System.out.println("WELCOME ADMIN");
			System.out.println("**********************");
			callAdminObj.adminOperation();

		} else {
			System.out.println("Invalid User !!!");
		}

	}

	private void callCustomerMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CustomerProcess callCustomerObj = new CustomerProcess();
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if (username.equals("user") && password.equals("1234")) {
			System.out.println("**********************");
			System.out.println("WELCOME TO EVRY BANKING SERVICE");
			System.out.println("**********************");
			callCustomerObj.customerOperation();

		} else {
			System.out.println("Invalid User !!!");
		}

	}

	public static void main(String[] args) {
		WelcomeBanking wc = new WelcomeBanking();
		wc.accessTypeSelection();
	}

}
