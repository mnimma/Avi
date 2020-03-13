class Inheritance {
	int a = 25;
}

class Employee extends Inheritance {
	int b = 35;

	public static void main(String args[]) {
		Employee e = new Employee();
		System.out.println(e.a + e.b);
	}
}
