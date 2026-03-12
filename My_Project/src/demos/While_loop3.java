package demos;

import java.util.Scanner;

public class While_loop3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Do you want to continue...");
	String c = sc.nextLine();
	
	while (c.equalsIgnoreCase("y"))
		
	{
		System.out.println("loop executed...");
		System.out.println("Do you want to continue...");
		c = sc.nextLine();
		System.out.println("loop ended..");
	}
	//System.out.println("loop ended..");
}
}
