package uti;

public class MyInteger {
	private int value;
	
	public MyInteger() {
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int n) {
		this.value = n;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return value % 2 == 1;
	}
	
	public boolean isPrime() {
		int  up  = (int)Math.sqrt(value);
		
		for(int i = 2; i <= up; i++) {
	        if(value % i == 0) {
	            return false;
	        }
	    }
		
		return true;
	}
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static boolean isOdd(int n) {
		return n % 2 == 1;
	}
	
	public static boolean isPrime(int n) {
		int  up  = (int)Math.sqrt(n);
		
		for(int i = 2; i <= up; i++) {
	        if(n % i == 0) {
	            return false;
	        }
	    }
		
		return true;
	}
	
	public static boolean isEven(MyInteger n) {
		return n.value % 2 == 0;
	}
	
	public static boolean isOdd(MyInteger n) {
		return n.value % 2 == 1;
	}
	
	public static boolean isPrime(MyInteger n) {
		int  up  = (int)Math.sqrt(n.value);
		
		for(int i = 2; i <= up; i++) {
	        if(n.value % i == 0) {
	            return false;
	        }
	    }
		
		return true;
	}
	
	public boolean equals(int n) {
		return n == value;
	}
	
//	public static boolean equals(MyInteger m) {
//		return m == value;							????????
//	}
	
	public int parseInt(char[] a) {		// m - the length of the array
		return Integer.parseInt(new String(a));			//parse a to x

	}
	
	public int parseInt(String a) {	
		return Integer.parseInt(a);
	}
}
