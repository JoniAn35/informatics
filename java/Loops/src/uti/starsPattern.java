package uti;

public class starsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 0; k < 7; k ++) {
			for (int i = 0; i < k; i ++) {
				System.out.print(" ");
			}
			for (int i = 0; i < 7 - k; i ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
