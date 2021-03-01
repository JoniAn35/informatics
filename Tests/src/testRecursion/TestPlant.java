package testRecursion;

public class TestPlant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant p1 = new Plant("flower", "normal");
		p1.waterIt();
		System.out.println("This plant needs " + p1.getLight() + " light.\n");
		
		Plant p2 = new Orchid("orchid", "extra");
		p2.waterIt();
		System.out.println("This plant needs " + p2.getLight() + " light.\n");
		
		Plant p3 = new Flytrap("flytrap", "a little");
		p3.waterIt();
		System.out.println("This plant needs " + p3.getLight() + " light.");
	}

}
