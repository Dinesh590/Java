package demos;

public class Local_variables_and_global_variables {

	String url; // global variable
	
	public void method1(){
		url= "http:\\google.com";
		System.out.println(url);
		
		int x; //local variable
		x=10;
		System.out.println(x);	
	}
public void method2(){
	System.out.println(url);
}
	
}

