package demos;

import java.util.Scanner;

public class Do_While_loop2 {

	public static void main(String[] args) {
		
		String c;
		do
		{
			System.out.println("loop executed");
			System.out.println("Do you want continue...");
			Scanner sc = new Scanner(System.in);
			c= sc.nextLine();
		}while(c.equalsIgnoreCase("y"));
		System.out.println("loop ended");

	}

}
