interface myown {
	public static final int x = 15;

	public abstract void a1();
}

class interfacedemo implements myown {
	public void a1() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {

		interfacedemo i = new interfacedemo();
		System.out.println(x);
		i.a1();
	}
}
