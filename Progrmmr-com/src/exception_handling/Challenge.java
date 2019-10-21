package exception_handling;

import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class Challenge {
	public static void main(String args[]){ 
		 Scanner scanner=new Scanner(System.in); 
		 String input;
		 int num; 
		  
		 System.out.println("Enter the ID number:");  
		 input = scanner.next(); 
		 ///{Write your code here  
		 
		 try {
			int length = input.length();
			if (length != 10) {
				throw new IOException();
			}
			num = Integer.parseInt(input);
			System.out.println("Input: " + input);
			System.out.println("correct");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Input: " + input);
			System.out.println("incorrect");
		}
		 	 
		 ///} 
		 
	} 
}
