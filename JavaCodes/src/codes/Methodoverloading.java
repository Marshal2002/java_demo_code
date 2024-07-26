package codes;
import java.util.*;
public class Methodoverloading {
	static int SumMethod(int a,int b) {
		return a+b;
	}
	static int SubMethod(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		int z;
		int y;
	         Scanner x=new Scanner(System.in); 
	         System.out.println("Enter a:");
	       int  a=x.nextInt();
	       System.out.println("Enter b:");
	       int b=x.nextInt();
	       z=SumMethod (a,b);
	      y=SubMethod(a,b); 
	       System.out.println("The sum is:"+z);
	       System.out.println("The sub is:"+y);
	       
	       
	       }

}
