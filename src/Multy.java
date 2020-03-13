class Animals {
	int a = 100;

	void sleep() {
		System.out.println("I sleep regularly");
	}
}

class Tigs extends Animals {
	void roar() {
		System.out.println("I shouts and eat animals");
	}
}

class Lion extends Tigs {
	public void eat() {
		System.out.println("I eat Animals");
	}
}

class Elephant extends Lion {
	public void weight() {
		System.out.println("I weight heavy");
	}
}

class Multy {
	public static void main(String args[]) {
		Tigs tig = new Tigs();
		Lion l = new Lion();
		Elephant E = new Elephant();
		E.weight();
		tig.sleep();
		tig.roar();
		l.eat();
		System.out.println(tig.a);

	}
}
