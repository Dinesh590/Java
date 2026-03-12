package demos;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		String course;
		System.out.println("enter course code");

		Scanner sc = new Scanner(System.in);
		course = sc.nextLine();

		switch (course.toLowerCase()) {
		case "s"
				+ "":
			System.out.println("selenium");
			break;
		case "j":
			System.out.println("java");
			break;
		case "p":
			System.out.println("python");
			break;
		default:
			System.out.println("invalid course");
		}

	}

}
