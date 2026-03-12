package demos;

import java.util.ArrayList;
import java.util.List;

public class For_loop6 {

	public static void main(String[] args) {
		
		// script access top3 elements present in a array list using for loop
		
		List<String> carlist = new ArrayList<String>();

		carlist.add("car1");
		carlist.add("car2");
		carlist.add("car3");
		carlist.add("car4");
		carlist.add("car5");
		for (int i = 0; i<3; i++) {
			System.out.println(carlist.get(i));
		}
	}

}
