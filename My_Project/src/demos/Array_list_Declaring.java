package demos;

import java.util.ArrayList;

public class Array_list_Declaring {

	public static void main(String[] args) {
		
		//Declaring ArrayList
		ArrayList<String> carlist = new ArrayList<String>(4);
		
		carlist.add("car1");
		carlist.add("car2");
		carlist.add("car3");
		carlist.add("car4");
		
		System.out.println(carlist.size());
		
		System.out.println(carlist.get(0));
		System.out.println(carlist.get(1));
		System.out.println(carlist.get(3));
		
		//replacing
		
		carlist.set(0, "New car");
		System.out.println("after replacing-"+carlist.get(0));
		
		//adding one more ArrayList
		
		carlist.add("car5");
		System.out.println(carlist.size());
		System.out.println(carlist.get(4));
		
	}

}
