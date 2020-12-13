package uti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestComperablePlusArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject[] object = new GeometricObject[5];
		object[0] = new Rectangle();
		object[1] = new Circle();
		object[2] = new Circle(4, "red", false);
		object[3] = new Rectangle(2,2, "purple", false);
		object[4] = new Rectangle(3,3);
		
		System.out.println("Out of the two circles, the larger is the one: "
					+ GeometricObject.max(object[1], object[2]));
		
		System.out.println("\nOut of the two circles, the larger is the one: "
				+ GeometricObject.max(object[0], object[3]));
		
		ArrayList<GeometricObject> list = new ArrayList<GeometricObject>
		(Arrays.asList(object[0], object[1], object[2], object[3], object[4]));
		
		Collections.sort(list);
		
		System.out.println();
		System.out.println("###################");
		System.out.println(list);
	}

}
