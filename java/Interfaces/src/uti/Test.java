package uti;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject[] gm = new GeometricObject[5];
		
		gm[0] = new Square("blue", false, 4.5);
		gm[1] = new Square();
		gm[2] = new Square();
		gm[3] = new Square("yellow", true, 15);
		gm[4] = new Square("red", false, 10);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(gm[i].toString() + "\nArea: " + gm[i].getArea());
			if(gm[i].isFilled()) {
				gm[i].howToColor();
			}
			System.out.println();
		}
	}

}
