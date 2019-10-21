package exception_handling;

import java.io.IOException;
import java.util.Scanner;

public class Challenge1 {
	public static void main(String args[]) {
		 Scanner scanner=new Scanner(System.in);
		 boolean continueLoop = true;
		 ///{Write you code here 
		 while(continueLoop == true)
		 {
			 System.out.println("Enter x coordinate of current point:");
			 int x1 = scanner.nextInt();
			 System.out.println("Enter y coordinate of current point:");
			 int y1 = scanner.nextInt();
			 System.out.println("Enter x coordinate of target point:");
			 int x2 = scanner.nextInt();
			 System.out.println("Enter y coordinate of target point:");
			 int y2 = scanner.nextInt();
			 
			 Point point = new Point(x1, y1); 
			 
			 try {
				int result = point.slope(x2, y2);
				System.out.println(result);
				if (result == 0) {
					throw new IOException();
				}
				
			} catch (Exception e) {
				System.out.println("Zero is an invalid denominator. Please try again.");
			}
		 }
		  
		///}

	}
}
