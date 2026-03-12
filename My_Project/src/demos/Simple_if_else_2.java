package demos;

public class Simple_if_else_2 {

	public static void main(String[] args) {
		String exptitle, acttitle;
		exptitle = "Google";
		acttitle = "google";
		if(exptitle.equalsIgnoreCase(acttitle))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fails");
		}
	}

}
