package uti;

import java.util.ArrayList;
import java.util.Arrays;

public class Cake {
	String name;
	Cook cook = new Cook();
	ArrayList<Layer> layers;
	
	public Cake() {
		layers = new ArrayList<Layer>(Arrays.asList(new Layer(1), new Layer(3), new Layer(3)));
	}
}
