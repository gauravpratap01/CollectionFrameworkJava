package CommonJava.CommonJava;
import org.testng.annotations.Test;

public class HashMapImpl {
	
	String credentials;
	
	@Test
	public void loginWithAdmin() {
		credentials = Data.getUserDetails().get("admin");
		String[] info = credentials.split("_");
		System.out.println(info[0]);
		System.out.println(info[1]);		
	}

}
