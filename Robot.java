public class Robot extends Animal {
	private int[] a = new int[5];
	private int[] c = new int[5];

	private int x;
	private int z;

	public Robot(int age, int weight, int distance, int speed, int acceleration) {
		super(age, weight, distance, speed, acceleration);

	}

	public void name() {
		System.out.println("\n\n\nMy name is E-102 GAM-MA.");
	}

	public void talk() {
		System.out.println("HEL-LO.");

	}

	public int walk(int distance) {
		int metalfeet;
		metalfeet = distance;
		c[z] = (0 + (int) (Math.random() * metalfeet));
		return c[z++];

	}

	public int run(int distance) {
		int velocity3 = 0;
		velocity3 = distance;
		a[x] = 0 + (int) (Math.random() * velocity3);
		return a[x++];

	}

	public int collision(int speed) {
		return 0;
	}

	// movement history
	public int[] Runhistory() {
		return a;
	}

	public int[] Walkhistory() {
		return c;
	}
}
