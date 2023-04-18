package gu.ac.it;
import java.io.*;
public class Triangle extends Figure {
	final int sides = 3;
	Triangle(double a, double b)
	{
		super(a,b);
	}
	int tellsides()
	{
		return sides;
	}
	double area()
	{
		return s1*s2/2;
	}
}
