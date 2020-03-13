class tourist {
	String s = "Harbhajan";
	int b = 2400;
}

class country extends tourist {
	int c = 3125;

	public static void main(String args[]) {
		country c1 = new country();
		System.out.println(c1.c);
		System.out.println(c1.s);
		System.out.println(c1.b);
	}

}
