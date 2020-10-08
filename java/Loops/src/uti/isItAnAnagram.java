package uti;

import java.util.Scanner;

public class isItAnAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String firstWord = sc.nextLine();
		String secondWord = sc.nextLine();
		String copyFirst = "", copySecond = "";
		
		for(int i = firstWord.length(), index = 0; i > 0; i--){
			if(firstWord.charAt(index) > 64 && firstWord.indexOf(index) < 123) {
				copyFirst += firstWord.charAt(index);
			}
			index++;
		}

		for(int i = secondWord.length(),index = 0; i > 0; i--){
			if(secondWord.charAt(index) > 64 && secondWord.indexOf(index) < 123) {
				copySecond += secondWord.charAt(index);
			}
			index++;
		}
		
		boolean anagrams = true;
		if (copySecond.length() == copyFirst.length()) {
			for (int i = 0; i < copyFirst.length(); i++) {
				int index = copySecond.indexOf(copyFirst.charAt(i));
				if (index == -1) {
					anagrams = false;
					break;
				}
				else {
					copySecond = copySecond.substring(0, index) + 
							copySecond.substring(index+1);
				}
			}
		}
		else {
			anagrams = false;
		}
		
		System.out.println("Are they anagrams: " + anagrams);
	}

}
