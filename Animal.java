public abstract class Animal {
  // encapsulation, do not want user to get direct access to variables

	private int age;
	private int weight;
	private int runningdistance;
	private int speed;
	private int acceleration;

	// constructor!!!!!
	public Animal(int age, int weight, int runningdistance, int speed,
			int acceleration) {
		super();
		this.age = age;
		this.weight = weight;
		this.runningdistance = runningdistance;
		this.speed = speed;
		this.acceleration = acceleration;

	}

	// user gets access to variables through set and get methods(I used source
	// and get set method)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getRunningdistance() {
		return runningdistance;

	}

	public void setRunningdistance(int runningdistance) {
		this.runningdistance = runningdistance;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public int getAcceleration() {
		return acceleration;
	}

	// overridden property
	public void name() {
		System.out.println("Uknown/no name!");
	}

	// method 1, overridden
	public void talk() {
		System.out.println("cannot talk!");
	}

	// method 2, overridden
	public int walk(int walkingdistance) {
		int step = 0;
		walkingdistance = step;
		return (0 + (int) (Math.random() * step));
	}

	// method 3, overridden
	public int run(int runningdistance) {
		int quickness = 0;
		runningdistance = quickness;
		return 0 + (int) (Math.random() * quickness);
	}

}
