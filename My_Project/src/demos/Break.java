package demos;

import java.util.ArrayList;
import java.util.List;

public class Break {

	public static void main(String[] args) {
		//using for loop break statement
		
		List<String> carlist = new ArrayList<String>();

		carlist.add("car1");
		carlist.add("car2");
		carlist.add("car3");
		carlist.add("car4");
		carlist.add("car5");
		for (String data : carlist) {
			System.out.println(data);
			if(data.equalsIgnoreCase("car3"))
			{
				break;
				
			}
		}

	}

}
