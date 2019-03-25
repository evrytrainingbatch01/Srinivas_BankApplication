package com.evry.domain;

/**
 * @author srinivas.p
 *
 */
public class Customer {
	private Integer id;
	private String firstName;
	private String lastName;
	private int age;
	private String city;
	private String country;
	private int mobileNo;
	private int balance;
	private String password;
	private int active;

	public Customer() {

	}

	public Customer(Integer id, String firstName, String lastName, int age, String city, String country, int mobileNo,
			int balance, String password, int active) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
		this.country = country;
		this.mobileNo = mobileNo;
		this.balance = balance;
		this.password = password;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", city="
				+ city + ", country=" + country + ", mobileNo=" + mobileNo + ", balance=" + balance + ", password="
				+ password + ", active=" + active + "]";
	}

	
}
