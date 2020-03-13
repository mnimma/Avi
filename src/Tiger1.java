class Animal {
	int a = 100;

	void eat() {
		System.out.println("It eats");
	}
}

class Tiger1 extends Animal {
	int b = 1000;

	public static void main(String args[]) {
		Tiger1 t = new Tiger1();
		System.out.println(t.a);
		t.eat();
		System.out.println(t.b);
	}
}
