package gu.ac.it;

public class DemoOfFigure {
	public static void main(String [] args) {
		Figure ref = new Rect(10,20);
		double ar_fig1 = ref.area();
		int s1 = ref.tellsides();
		System.out.println("Area of Rect: "+ ar_fig1);
		System.out.println("Number of sides: "+ s1);
		ref = new Triangle(5,4);
		double ar_fig2 = ref.area();
		int s2 = ref.tellsides();
		System.out.println("Area of Rect: "+ ar_fig2);
		System.out.println("Number of sides: "+ s2);
	}
}
