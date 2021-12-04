package CommonJava.CommonJava;

import java.util.HashMap;

public class Data {
	
	public static HashMap<String,String> getUserDetails() {
		HashMap<String,String> user=new HashMap<String, String>();
		user.put("admin", "adminuser_Pass123");
		user.put("customer", "gaurav_Pass345");
		return user;
	}	

}
