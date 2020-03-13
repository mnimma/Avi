interface Myinterfacedemo { // Interface
	public abstract void a(); // Abstract method
}

class Myinterfacedemo2 implements Myinterfacedemo {
	public void a() {
		System.out.println("Hello world");

	}

	public static void main(String args[]) {
		Myinterfacedemo2 id = new Myinterfacedemo2();
		id.a();

	}

}
