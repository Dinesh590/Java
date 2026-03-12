package demos;

import java.util.ArrayList;
import java.util.List;

public class For_Each_loop2 {

	public static void main(String[] args) {
		
		// script to access all elements present in a array using : for each loop
		
		List<String> carlist = new ArrayList<String>();

		carlist.add("car1");
		carlist.add("car2");
		carlist.add("car3");
		carlist.add("car4");
		carlist.add("car5");
		for (String data : carlist) {
			System.out.println(data);
		}

	}

}
