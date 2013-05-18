public class Monkey extends Animal {

  private int[] a = new int[5];
	private int[] w = new int[4];
	private int x;
	private int l;

	public Monkey(int age, int weight, int runningdistance, int speed,
			int acceleration) {
		super(age, weight, runningdistance, speed, acceleration);

	}

	public void name() {
		System.out.println("aaah ooh ooooh(my name is George)!");
	}

	public void talk() {
		System.out.println("Oooh ooh aah aaah!");

	}

	public int walk(int runningdistance) {
		int paw;
		paw = runningdistance;
		w[l] = (0 + (int) (Math.random() * paw));
		return a[l++];
	}

	public int run(int runningdistance) {
		int velocity;
		velocity = runningdistance;
		a[x] = 0 + (int) (Math.random() * velocity);
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
		return w;
	}
}
