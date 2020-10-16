package uti;

public class palindromicPrime {

	public static boolean isPrime(int x) {
		int  up  = (int)Math.sqrt(x);
		
		for(int i = 2; i <= up; i++) {
	        if(x % i == 0) {
	            return false;
	        }
	    }
		
		return true;
	}
	
	public static String toString(int x) {
		String a = "";
		
		while (x > 0) {
			a += x % 10;
			x /= 10;
		}
		
		return a;
	}
	
	public static boolean isPalindromic(int x) {
		String a = toString(x);
		int begining = 0, ending = a.length() - 1;
		
		for (; begining < ending; begining++, ending--) {
	        if(a.charAt(begining) !=  a.charAt(ending)) {
	            return false;
	        }
	    }
			
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		
		for (int i = 0; i < 120;) {
			if (isPrime(num) && isPalindromic(num)) {
				if (i % 10 == 0) {
					System.out.println();
				}
			
				System.out.print(num + " ");
				
				i++;
			}
			
			num++;
		}
	}

}
