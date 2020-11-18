package uti;

import java.util.Scanner;

public class TestMyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n = 57;
		Scanner sc = new Scanner(System.in);
		
		MyInteger integer = new MyInteger();
		System.out.println("Enter a value: ");
		int value = sc.nextInt();
		integer.setValue(value);
		
		char[] charArray = new char[5];
		String string = new String();
		
		System.out.println("The value: ");
		System.out.println("Is it even: " + integer.isEven() + ";	" + "Is it odd: " + integer.isOdd() + "; 	" 
				+ "Is it prime: " + integer.isEven());
		
		System.out.println("The specified value: ");
		System.out.println("Is it even: " + MyInteger.isEven(n) + ";	" + "Is it odd: " + MyInteger.isOdd(n) + "; 	" 
				+ "Is it prime: " + MyInteger.isEven(n));
		
		System.out.println("The object: ");
		System.out.println("Is it even: " + MyInteger.isEven(integer) + ";	" + "Is it odd: " + MyInteger.isOdd(integer) + "; 	" 
				+ "Is it prime: " + MyInteger.isEven(integer));
		
		System.out.println("Is the value of the object equal to the specified value: " + integer.equals(n));
		
//		System.out.println("Is the value of the object equal to the specified value: " + integer.equals(integer));
		
		System.out.println("Now enter 5 numeric characters: ");
		for (int i = 0; i < 5; i++) {
			charArray[i] = sc.next().charAt(0);;
		}
		System.out.println("The numeric characters converted to an int are: " + integer.parseInt(charArray));
		
		System.out.println("Now enter a string: ");
		string = sc.next();
		System.out.println("The string converted to an int are: " + integer.parseInt(string));
		

	}

}
