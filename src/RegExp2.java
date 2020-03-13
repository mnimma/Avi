
public class RegExp2 {
	public static void main(String args[]) {
		String x = "ramesh@gmail.com";

		if (x.matches("\\w+\\@[a-z A-Z]+\\.[a-z]{2,4}"))

			System.out.println("Pass");

		else
			System.out.println("Fail");
	}
}