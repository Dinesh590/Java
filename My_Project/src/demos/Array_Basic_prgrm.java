package demos;

public class Array_Basic_prgrm {

	public static void main(String[] args) {
		
		String[] cars = {"car1","car2","car3","car4"};
		
		//counting no.of elements in a array using : length
		System.out.println(cars.length);
		
		//accessing elements presents] in a array using : array[index]
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		
		//replacing existing element using : array[index]= new value
		
		cars[0]="new car";
		System.out.println("after replacing.."+cars[0]);
		
		// checking array index out of bound exception
		cars[4]="some car";

	}

}
