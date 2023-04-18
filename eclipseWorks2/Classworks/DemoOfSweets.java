package gu.ac.it;

public class DemoOfSweets {
	public static void main(String[] args) {
		Sweet ptr[] = {
				new Burfi(),
				new Jalebi(),
				new Rasgulla(),
				new Sandesh()
		};
		for (int i=0;i<4;i++)
		{
			ptr[i].sweetStatus();
		}
	}
}
