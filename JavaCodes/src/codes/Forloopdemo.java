/*Write a Java program to display the pattern like a right angle triangle with a number.
Input number of rows : 10                                                                                     
1                                                                                                       
12                                                                                                       
123                                                                                                       
1234                                                                                                       
12345                                                                                                       
123456                                                                                                       
1234567                                                                                                       
12345678                                                                                                      
123456789                                                                                                     
12345678910  
package javademo2;

import java.util.*;

public class Forloopdemo {
	public static void main(String[] args) {
		int i, j, n;
		System.out.print("Input number of rows : ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++)
				System.out.println(j);

			System.out.println("");
		}
	}
*/
package codes;

import java.util.*;

public class Forloopdemo {
	public static void main(String[] args) {
		int i,j,n,k=1;

   		System.out.print("Input number of rows : ");

   		Scanner in = new Scanner(System.in);
		    n = in.nextInt();

   		for(i=1;i<=n;i++)
   		{
		for(j=1;j<=i;j++)
		{
	   	System.out.print(k++);
		}
		System.out.println("");
	   	} 
   		
	}
}
