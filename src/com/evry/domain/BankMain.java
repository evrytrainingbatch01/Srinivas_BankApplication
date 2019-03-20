package com.evry.domain;

public class BankMain {
	public static void main(String[] args) {
		/*
		 * Scanner scn=new Scanner(System.in); System.out.println("Enter a value"); int
		 * a=scn.nextInt(); System.out.println("value is :" +a);
		 * --------------------------------- char c=scn.next().charAt(0);
		 * System.out.println("value is"+ c);
		 */
		WelcomeBanking wc = new WelcomeBanking("Srinivas", "BA001");
		wc.showMenu();
		

	}
}
