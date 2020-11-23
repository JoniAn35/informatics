package uti;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Breakfast breakfast =  new Breakfast();
		
		Cook cook1 = new Cook();
		cook1.name = "Antonio";
		
		Cook cook2 = new Cook();
		cook2.name = "Frida";
		
		Cake cake1 = new Cake();
		cake1.cook = cook2;
		cake1.name = "Black Forest";
		
		Cake cake2 = new Cake();
		cake2.cook = cook1;
		cake2.name = "Garash";
		
		Cake cake3 = new Cake();
		cake3.cook = cook2;
		cake3.name = "Red velvet";
		
		cook1.cakes = new ArrayList<Cake>(Arrays.asList(cake1, cake2));
		cook1.cakes = new ArrayList<Cake>(Arrays.asList(cake1, cake2));
		
		breakfast.cakes = new ArrayList<Cake>(Arrays.asList(cake1, cake2, cake3));
		
		System.out.println("The breakfast is: ");
		for (Cake cake : breakfast.cakes) {
			System.out.println(cake.name + " by " + cake.cook.name);
		}
		
	}

}
