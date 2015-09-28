package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	//calls triangle class into this class
	Triangle triangle = new Triangle();
	
	//
	@Test
	public void testGetArea() {
		triangle.setSide1(3.0);
		triangle.setSide2(7.0);
		triangle.setSide3(9.0);
		double area = triangle.getArea();
		assertEquals(8.79, area, 0.0);
	}

	@Test
	public void testGetPerimeter() {
		triangle.setSide1(3.0);
		triangle.setSide2(7.0);
		triangle.setSide3(9.0);
		double perim = triangle.getPerimeter();
		assertEquals(19.0, perim, 0.0);
	}

}