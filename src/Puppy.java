
class birds {
	int a = 100;

	void action() {
		System.out.println("EATS");
	}
}

class crow extends birds {
	int b = 100;
}

class Puppy extends crow {
	int c = 2400;

	public static void main(String args[]) {
		Puppy p1 = new Puppy();
		System.out.println(p1.c);
		System.out.println(p1.b);
		System.out.println(p1.a);
		p1.action();

	}
}
