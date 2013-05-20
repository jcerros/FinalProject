public class Monkey extends Animal {

	private int[] a = new int[5];
	private int[] w = new int[5];

	private int x;
	private int l;

	public Monkey(int age, int weight, int distance, int speed, int acceleration) {
		super(age, weight, distance, speed, acceleration);

	}

	public void name() {
		System.out.println("aaah ooh ooooh(my name is George)!");
	}

	public void talk() {
		System.out.println("Oooh ooh aah aaah!");

	}

	public int walk(int distance) {
		int paw;
		paw = distance;
		w[l] = (0 + (int) (Math.random() * paw));
		return w[l++];
	}

	public int run(int distance) {
		int velocity;
		velocity = distance;
		a[x] = 0 + (int) (Math.random() * velocity);
		return a[x++];
	}

	public int collision() {

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
