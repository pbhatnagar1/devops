package com.ptc.devops;

public class Calc {
	
	public int add (int a, int b)  {
		return a+ b;
	}
	
	public int divide(String a , String b) {
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		return i/j;
	}
}
