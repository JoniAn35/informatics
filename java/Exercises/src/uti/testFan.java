package uti;

public class testFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fan fan1 = new fan();
		fan fan2 = new fan();
		
		fan1.setSpeed(fan1.fast);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setSwitchedOn(true);
		
		fan2.setSpeed(fan2.medium);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setSwitchedOn(false);
		
		System.out.println(fan1.toString() + "		" + fan2.toString());
		
	}

}
