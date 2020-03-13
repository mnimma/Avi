
import org.testng.annotations.Test;

public class Tng7 {

	@Test(priority = 1)
	public void login() {
		System.out.println("Login Executed");

	}

	@Test(priority = 4)
	public void logout() {
		System.out.println("Logout Executed");

	}

	@Test(priority = 2)
	public void addEmp() {
		System.out.println("New Emp Added");

	}

	@Test(priority = 3)
	public void delEmp() {
		System.out.println("del Emp");

	}
}