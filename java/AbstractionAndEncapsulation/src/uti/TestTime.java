package uti;

public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time();
		Time time2 = new Time(555550000L);
		Time time3 = new Time(5, 23, 55);
		
		System.out.println("The first time is: " + time1.getHour() + ": " + time1.getMinutes() + ": " + time1.getSeconds());
		System.out.println("The second time is: " + time2.getHour() + ": " + time2.getMinutes() + ": " + time2.getSeconds());
		System.out.println("The third time is: " + time3.getHour() + ": " + time3.getMinutes() + ": " + time3.getSeconds());
	}

}
