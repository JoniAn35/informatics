package uti;

import java.util.Scanner;

public class scholarship {
	
//	public static boolean getScholarship (scholar student) {
//		if (student.averageProgress >= 5.75) {
//			return true;
//		}
//		return false;
//	}
	
	public static void whoGetsScholarship (scholar[] pupil) {
		for (int i = 0; i < 5; i++) {
			if (pupil[i].getScholarship()) {
				System.out.println(pupil[i].name);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scholar[] pupil = new scholar[5];
		//scholar a = new scholar();
		Scanner sc = new Scanner(System.in);
		
		for (int i  = 0; i < 5; i++) {
			pupil[i] = new scholar(sc.next(), sc.nextDouble());
//			pupil[i].name = sc.next();
//			pupil[i].averageProgress = sc.nextDouble();
		}
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(pupil[i].name + " -> " + pupil[i].averageProgress);
//		}
		
		System.out.println("Scholarship will get: ");
		whoGetsScholarship(pupil);
		
	}

}
