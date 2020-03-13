import org.testng.annotations.Test;

public class Tng4 {
	@Test
	public void login() {
		System.out.println("Login Executed");
	}

	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout Executed");
	}
}