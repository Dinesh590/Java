package demos;

import java.security.PublicKey;

public class Method_overloading {

	
 
 public static void payment(String wallettype, int uid)
 {
	System.out.println("wallettype :"+wallettype);
	System.out.println("uid:"+uid);
 

	}
 public static void main(String[] args) {
	 payment("google pay", 1221);
 }
}
