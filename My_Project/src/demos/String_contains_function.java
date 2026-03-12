package demos;

public class String_contains_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expurl, acturl;
		expurl = "google";
		acturl = "https://support.Google.com/mail/answer/56256?hl=en";
		System.out.println(acturl.contains(expurl));
		
		
		// another method here compare lower case to upper case
		System.out.println(acturl.toLowerCase().contains(expurl.toLowerCase()));
	}

}
