package com.akk;

public class Cirlce extends Shape {
	Double r;
	public void computeArea(Double r)
	{
		Double Area_circle=((22/7)*r*r);
		System.out.println("Area of the circle: "+Area_circle);
	}

}
