package com.evry.domain;

import java.util.Scanner;

import com.evry.serviceimp.AdminServiceImp;

public class BankMain {
	public static void main(String[] args) {
		/*
		 * WelcomeBanking wc = new WelcomeBanking("Srinivas", "BA001"); wc.showMenu();
		 */
		System.out.println("Welocome to Evry Banking Services");
		Scanner input = new Scanner(System.in);

		String username;
		String password;

		System.out.println("Please enter your user name to continue: ");
		username = input.next();

		System.out.println("Password: ");
		password = input.next();

		if (username.equals("admin") && password.equals("@123")) {
			System.out.println("You are logged in as Admin");
			System.out.println("----------------------------------'");

		} else {
			System.out.println("Invalid User !!!");
		}

		Scanner sc = new Scanner(System.in);

		AdminServiceImp asi = new AdminServiceImp();

		System.out.println("Select 1 or 2 ");
		System.out.println("1.Get Admin");
		System.out.println("2.Add Customer");
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			getAdmin(sc, opt, asi);
			break;
		case 2:
			addCustomer(sc, opt, asi);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}

	

	private static void getAdmin(Scanner sc, Integer opt, AdminServiceImp asi) {
		// TODO Auto-generated method stub
		if (opt.equals(1)) {
			System.out.println("Please provide Admin ID : ");
			Integer adminDetails = sc.nextInt();
			Admin admD = asi.getAdmin(adminDetails);
			// System.out.println(setOfAdmins);
			System.out.println("Admin details : ");
			System.out.println(
					admD.getId() + "\t" + admD.getFirstName() + "\t" + admD.getLastName() + "\t" + admD.getAge());
		}

	}
	
	private static void addCustomer(Scanner sc, Integer opt, AdminServiceImp asi) {
		// TODO Auto-generated method stub
		if(opt.equals(2)) {
			Customer cust = new Customer();
			System.out.println("Enter your First-Name :");
			cust.setFirstName(sc.next());
			System.out.println("Enter your Last-Name :");
			cust.setLastName(sc.next());
			System.out.println("Enter your Age :");
			cust.setAge(sc.nextInt());
			System.out.println("Enter your City :");
			cust.setCity(sc.next());
			System.out.println("Enter your Country :");
			cust.setCountry(sc.next());
			System.out.println("Enter your Mobile No :");
			cust.setMobileNo(sc.nextInt());
			
			boolean CustAdded = asi.addCustomer(cust);
			if(CustAdded) {
				System.out.println("Customer Added Successfully");
			}
			
		}
		
	}

}
