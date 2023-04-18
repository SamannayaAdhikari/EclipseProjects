package gu.ac.it;
import java.util.*;
import java.io.*;
public class UsingObjectSlice {
	public static void main(String [] args) {
		DerivedDemo d2 = new DerivedDemo(10,20,30);
		DemoObjectSlice d1 = new DemoObjectSlice();
		System.out.println(d2.bx + " " + d2.by + d2.dx);
		d1=d2;
		System.out.println(d1.bx + d2.by);
	}
}
