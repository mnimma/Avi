
public class RegExp {
	public static void main(String args[]) {
		String x = "ramesh@gmail.com";

		if (x.matches("\\w+\\@\\w+\\.\\w+"))

			System.out.println("Pass");

		else
			System.out.println("Fail");
	}
}