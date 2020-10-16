package uti;

public class emirp {
	
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
	
	public static boolean isBackwordsPrime(int x) {
		int a = 0;
		for(; x > 0; x = x / 10) {
			a *= 10;
			a += (x % 10);
		}
		
		int  up  = (int)Math.sqrt(a);
		
		for(int i = 2; i <= up; i++) {
	        if(a % i == 0) {
	            return false;
	        }
	    }
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		
		for (int i = 0; i < 120; num++) {
			if(isPrime(num) && !isPalindromic(num) && isBackwordsPrime(num)) {
				if (i % 10 == 0) {
					System.out.println();
				}
			
				System.out.print(num + " ");
				
				i++;
			}
		}
	}

}
