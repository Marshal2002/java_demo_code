/*4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. 
 * Calculate the area and circumference of the circle.
 * C = 2 × π × r
A = π × r2

 */

package codes;

import java.util.*;

class circle {
	int radius;

	void area(double radius) {
		double Pi = 3.14;
		double area = Pi * radius * radius;
		System.out.println("The area of the circle:" + area);
	}

	void circumfernce(double radius) {
		double Pi = 3.14;
		double circumfernce = 2 * Pi * radius;
		System.out.println("The circumference of the circle is:" + circumfernce);
	}

	void diameter(double radius) {
		double diameter = radius * 2;
		System.out.println("The diameter of the circle is:" + diameter);
	}
}

public class Classsdemo2 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the value of radius of the circle to find its area and cirumfernce");
		System.out.println("Radius =");
		double radius = x.nextDouble();
		circle findarea = new circle();
		findarea.area(radius);
		circle findcircum = new circle();
		findcircum.circumfernce(radius);
		circle finddiameter = new circle();
		finddiameter.diameter(radius);

	}

}
