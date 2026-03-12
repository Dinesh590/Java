package demos;

import java.util.Scanner;

public class Nested_if {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first value");
    int a= sc.nextInt();
    
    System.out.println("enter second value");
    int b=sc.nextInt();
    
    //System.out.println(a);
    //System.out.println(b);
    
    if(a>b)
    {
    	System.out.println("a is big");
    }else if(b>a)
    {
    	System.out.println("b is big");
    }else
    {
    	System.out.println("both are same");
    }
}
}
