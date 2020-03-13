class Inherit1 {
	int a = 20;

	void b() {
		System.out.println("love Animals");
	}
}

class cute extends Inherit1 {
	void c() {
		System.out.println("looks cute");
	}
}

class P {
	public static void main(String args[]) {
		cute g1 = new cute();
		System.out.println(g1.a);
		g1.c();
	}

}
