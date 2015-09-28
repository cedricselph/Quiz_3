package Main;

import Main.GeometricObject;

public class Triangle extends GeometricObject{
	
	//Sets side lengths
	private double side1=1.0;
	
	private double side2=1.0;
	
	private double side3=1.0;
	
	//Creates no arg constructor for Triangle()
	public Triangle() {}
	
	//Creates a constructor
	public Triangle(double side1, double side2, double side3) {
		super();
		
		this.side1 = side1;
		
		this.side2 = side2;
		
		this.side3 = side3;}
	//gets side lengths
	public double getSide1() {
	    return side1;}

	public double getSide2() {
	    return side2;}

	public double getSide3() {
	    return side3;}

	public void setSide1(double side1) {
		this.side1 = side1;}

	public void setSide2(double side2) {
		this.side2 = side2;}

	public void setSide3(double side3) {
		this.side3 = side3;}
	//Calculates perimeter
	public double getPerimeter(){
		return (side1 + side2 + side3);}
	//calculates area
	public double getArea() {
		double perimeter = getPerimeter() / 2;
		
		double area = Math.sqrt(perimeter * ((perimeter - side1) * (perimeter - side2) * (perimeter - side3)));
		
		double area100 = area * 100;
		
		double decimal_Area = Math.round(area100);
		
		return decimal_Area/100;}
	
	public String toString() {
		return ("The triangle:side 1= " + side1 + " side 2 = " + side2 
				+ " side 3 =" + side3);}
}