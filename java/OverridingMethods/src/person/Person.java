package person;

public class Person {
	String name;
	String address;
	String phoneNumber;	// int/long ?????
	String e_mail;
	
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address 
				+ "\nPhone number: " + this.phoneNumber + "\nE-mail: " + this.e_mail;
	}
}
