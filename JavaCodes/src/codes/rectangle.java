/*3. Write a Java program to create a class called "Rectangle" with width and height attributes.
 *  Calculate the area and perimeter of the rectangle.*/

package codes;
import java.util.*;
class rect{
int width;
int height;
	
  public void area(int width,int height) {
		int area =width*height;
		System.out.println("Area of the rectangle ="+area);
  }
  public void perimeter(int width,int height) {
	  int perimeter= 2*(width+height);
	  System.out.println("Perimeter of the rectangle is="+perimeter);
  }
	   
   }
	
	public class rectangle {
	public static void main(String[] args) {
		rect findarea = new rect();
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the value of width and height to find the area and perimeter of a rectangle:");
		System.out.println("width =");
		int width=x.nextInt();
		System.out.println("height =");
		int height=x.nextInt();
		findarea.area(width,height);
		rect  findperi=new rect();
		findperi.perimeter(width,height);
		
	}
	}


