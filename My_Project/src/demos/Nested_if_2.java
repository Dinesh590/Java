package demos;

import java.util.Scanner;

public class Nested_if_2 {

	public static void main(String[] args) {
		
		String course;
		System.out.println("enter course code");
		
		Scanner sc = new Scanner(System.in);
		course =sc.nextLine();
		if(course.equalsIgnoreCase("s"))
		{
			System.out.println("selenium");
		}
		else if(course.equalsIgnoreCase("j"))
		       {
			System.out.println("java");
		       }else if(course.equalsIgnoreCase("p"))
		{
			System.out.println("python");
		}else
		{
			System.out.println("invalid course");
		}

	}

}
