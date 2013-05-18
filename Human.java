public class Human extends Animal {

  private int[] a = new int[5];
	private int[] b = new int[4];
	private int x;
	private int y;

	public Human(int age, int weight, int runningdistance, int speed,
			int acceleration) {
		super(age, weight, runningdistance, speed, acceleration);

	}

	public void name() {
		System.out.println("\n\n\nMy name is Mesut Ozil!!");
	}

	public void talk() {
		System.out.println("Hello!");

	}

	public int walk(int runningdistance) {
		int feet;
		feet = runningdistance;
		b[y] = 0 + (int) (Math.random() * feet);
		return b[y++];
	}

	public int run(int runningdistance) {
		int velocity2 = 0;
		velocity2 = runningdistance;
		a[x] = 0 + (int) (Math.random() * velocity2);
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
		return b;
	}
}
