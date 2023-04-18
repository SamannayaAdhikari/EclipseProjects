package gu.ac.it;

public abstract class Figure{
	abstract double area();
	abstract int tellsides();
	double s1,s2;
	Figure(double a, double b)
	{
		s1 = a;
		s2 = b;
	}
}
