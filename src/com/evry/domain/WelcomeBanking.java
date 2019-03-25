package com.evry.domain;

import java.util.Scanner;

import com.evry.serviceimp.AdminServiceImp;
import com.evry.serviceimp.CustomerServiceImp;

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
		String firstname;
		String password;
		AdminServiceImp asi = new AdminServiceImp();
		Scanner sc = new Scanner(System.in);
		AdminProcess callAdminObj = new AdminProcess();

		System.out.println("Enter username");
		firstname = sc.next();
		System.out.println("Enter password");
		password = sc.next();
		Admin admin = asi.loginAdmin(firstname, password);

		if (admin.getActive() == 1) {
			System.out.println("**********************");
			System.out.println("WELCOME ADMIN");
			System.out.println("**********************");
			callAdminObj.adminOperation();

		} else {
			System.out.println("Invalid User Type !!!");
		}

	}

	private void callCustomerMethod() {
		String firstname;
		String password;
		CustomerServiceImp custSerImp = new CustomerServiceImp();
		Scanner sc = new Scanner(System.in);
		CustomerProcess callCustomerObj = new CustomerProcess();

		System.out.println("Enter username");
		firstname = sc.next();
		System.out.println("Enter password");
		password = sc.next();
		Customer customer = custSerImp.loginCustomer(firstname, password);
		if (customer.getActive() == 1) {
			System.out.println("**********************");
			System.out.println("WELCOME CUSTOMER");
			System.out.println("**********************");
			callCustomerObj.customerOperation();

		} else {
			System.out.println("Invalid User Type !!!");
		}


	}

	public static void main(String[] args) {
		WelcomeBanking wc = new WelcomeBanking();
		wc.accessTypeSelection();
	}

}
