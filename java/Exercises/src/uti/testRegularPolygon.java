package uti;

public class testRegularPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		regularPolygon polygon1 = new regularPolygon();
		regularPolygon polygon2 = new regularPolygon(6, 4);
		regularPolygon polygon3 = new regularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println(polygon1.getPerimeter() + "		" + polygon1.getArea());
		System.out.println(polygon2.getPerimeter() + "		" + polygon2.getArea());
		System.out.println(polygon3.getPerimeter() + "		" + polygon3.getArea());
	}

}
