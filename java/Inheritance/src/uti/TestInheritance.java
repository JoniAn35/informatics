package uti;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle1 = new Triangle();
		System.out.println(triangle1.printRectangle());
		System.out.println(triangle1.toString());
		System.out.println("The area is: " + triangle1.getArea() +
				"\nAnd the perimeter is: " + triangle1.getPerimeter() + "\n");
		
		Triangle triangle2 = new Triangle(3, 4, 5);
		System.out.println(triangle2.printRectangle());
		System.out.println(triangle2.toString());
		System.out.println("The area is: " + triangle2.getArea() +
				"\nAnd the perimeter is: " + triangle2.getPerimeter());
	}

}
