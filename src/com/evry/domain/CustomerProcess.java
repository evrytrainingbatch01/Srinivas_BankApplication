package com.evry.domain;

import java.util.Scanner;

import com.evry.serviceimp.CustomerServiceImp;

/**
 * @author srinivas.p
 *
 */
public class CustomerProcess {
	int accNo, bal, amt;

	public static void main(String[] args) {
		CustomerProcess cusPro = new CustomerProcess();
		cusPro.customerOperation();
	}

	void customerOperation() {
		Scanner sc = new Scanner(System.in);
		boolean endLoop = true;
		CustomerServiceImp custSerImp = new CustomerServiceImp();

		System.out.println("1. Account Details");
		System.out.println("2. Deposit Amount");
		System.out.println("3. Check Balance");
		System.out.println("4. Withdraw Money");
		System.out.println("5. Send Money");
		System.out.println("6. Logout");

		while (endLoop) {
			System.out.println("**********************************************");
			System.out.println("Please Enter Your Option ");
			System.out.println("**********************************************");
			int custOpt = sc.nextInt();
			switch (custOpt) {
			case 1:
				getAccountDetails(sc, custOpt, custSerImp);
				break;
			case 2:
				depositMoney(sc, custOpt, amt, bal);
				break;
			case 3:
				checkBalance(sc, custOpt, bal);
				break;
			case 4:
				withdrawMoney(sc, custOpt, amt, bal);
				break;
			case 5:
				sendMoney(sc, custOpt, custSerImp);
				break;
			case 6:
				endLoop = true;
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

	private void getAccountDetails(Scanner sc, Integer custOpt, CustomerServiceImp custSerImp) {
		// TODO Auto-generated method stub
		if (custOpt.equals(1)) {
			System.out.println("Please provide Customer ID : ");
			Integer customerAccount = sc.nextInt();
			Customer custAcc = custSerImp.getCustomerDetails(customerAccount);
			System.out.println("Your Account Details : ");
			System.out.println("\n\t Customer ID : " + custAcc.getId() + "\n\t First Name  : " + custAcc.getFirstName() + "\n\t Last Name   : " + custAcc.getLastName()
					+ "\n\t Age         : " + custAcc.getAge() + "\n\t City        : " + custAcc.getCity() + "\n\t Country     : " + custAcc.getCountry()
					+ "\n\t Mobile No   : " + custAcc.getMobileNo() + "\n\t Balance     : " + custAcc.getBalance()+ "\n\t Password    : " + custAcc.getPassword());
		}
	}

	private int depositMoney(Scanner sc, Integer custOpt, int amt, int bal) {
		// TODO Auto-generated method stub

		if (custOpt.equals(2)) {
			System.out.print("Enter amount to deposit:");
			amt = sc.nextInt();
			if (amt <= 0) {
				System.out.println("Invalid Amount");
				return 1;
			}
			bal = bal + amt;
			System.out.println("----------------------------");
			System.out.println("Amount added successfully !!!");
			System.out.println("----------------------------");
			return 0;
		}
		return bal;

	}

	private void checkBalance(Scanner sc, Integer custOpt, int bal) {
		// TODO Auto-generated method stub
		if (custOpt.equals(3)) {
			System.out.println("Your Savings Account Balance :" + bal);
		}
	}

	private int withdrawMoney(Scanner sc, Integer custOpt, int amt, int bal) {
		// TODO Auto-generated method stub
		if (custOpt.equals(4)) {
		}
		System.out.println("Your Current Balance Is :" + bal);
		System.out.print("Enter amount to withdraw:");
		amt = sc.nextInt();
		if (bal < amt) {
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal - amt;
		return 0;

	}

	private void sendMoney(Scanner sc, int custOpt, CustomerServiceImp custSerImp) {
		// TODO Auto-generated method stub

	}

}
