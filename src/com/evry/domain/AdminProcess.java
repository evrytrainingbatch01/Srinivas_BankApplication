package com.evry.domain;

import java.util.List;
import java.util.Scanner;
import com.evry.serviceimp.AdminServiceImp;

/**
 * @author srinivas.p
 *
 */
public class AdminProcess {
	public static void main(String[] args) {
		AdminProcess adminPro = new AdminProcess();
		adminPro.adminOperation();
	}

	void adminOperation() {

		Scanner sc = new Scanner(System.in);
		boolean endLoop = true;
		AdminServiceImp asi = new AdminServiceImp();

		System.out.println("1. Get Admin");
		System.out.println("2. Add Customer");
		System.out.println("3. Delete Customer");
		System.out.println("4. View All Customers");
		System.out.println("5. Logout");

		while (endLoop) {
			System.out.println("**********************************************");
			System.out.println("Please Enter Your Option ");
			System.out.println("**********************************************");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				getAdmin(sc, opt, asi);
				break;
			case 2:
				addCustomer(sc, opt, asi);
				break;
			case 3:
				deleteCustomer(sc, opt, asi);
				break;
			case 4:
				viewAllCustomers(sc, opt, asi);
				break;
			case 5:
				endLoop = false;
				System.out.println("You've been logged out successfully");
				WelcomeBanking callWelcomeObj = new WelcomeBanking();
				callWelcomeObj.accessTypeSelection();

				break;

			default:
				System.out.println("Invalid choice");
				break;

			}

		}

	}

	private static void getAdmin(Scanner sc, Integer opt, AdminServiceImp asi) {
		// TODO Auto-generated method stub
		if (opt.equals(1)) {
			System.out.println("Please provide Admin ID : ");
			Integer adminDetails = sc.nextInt();
			Admin admD = asi.getAdmin(adminDetails);
			System.out.println("Admin details : ");
			System.out.println(admD.getId() + "     " + admD.getFirstName() + "     " + admD.getLastName() + "     "
					+ admD.getAge());
		}

	}

	private static void addCustomer(Scanner sc, Integer opt, AdminServiceImp asi) {
		// TODO Auto-generated method stub
		if (opt.equals(2)) {
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
			System.out.println("Enter your Balance :");
			cust.setBalance(sc.nextInt());

			boolean CustAdded = asi.addCustomer(cust);
			if (CustAdded) {
				System.out.println("Customer Added Successfully");
			}

		}

	}

	private static void deleteCustomer(Scanner sc, Integer opt, AdminServiceImp asi) {
		// TODO Auto-generated method stub
		if (opt.equals(3)) {
			System.out.println("Please Customer id you want to delete : ");
			Integer customerIdDeleted = sc.nextInt();
			boolean customerDeleted = asi.delCustomer(customerIdDeleted);
			if (customerDeleted) {
				System.out.println("Customer Delete Successfully");
			}

		}

	}

	private static void viewAllCustomers(Scanner sc, Integer opt, AdminServiceImp asi) {
		// TODO Auto-generated method stub
		if (opt.equals(4)) {
			List<Customer> listOfCustomers = asi.viewCustomers();
			// System.out.println(setOfAdmins);
			System.out.println("List of EVRY Bank Customers");
			for (Customer cusList : listOfCustomers) {
				System.out.println(cusList.getId() + "     " + cusList.getFirstName() + "     " + cusList.getLastName()
						+ "     " + cusList.getAge() + "     " + cusList.getCity() + "     " + cusList.getCountry()
						+ "     " + cusList.getMobileNo() + "     " + cusList.getBalance());
			}
		}
	}
}
