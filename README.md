public class Bi_Pedmain {
	public static void main(String args[]) {

		
// objects
		Monkey Object = new Monkey(7, 75, 20, 50, 20);
		Human Object2 = new Human(21, 170, 26, 15, 5);
		Robot Object3 = new Robot(9, 55, 15, 45, 15);


// Monkey
		Object.name();
		Object.talk();
		System.out.println("monkey age :" + Object.getAge() + " yrs"
				+ "\nMonkey wieght:" + Object.getWeight() + " lbs"
				+ "\nMonkey Distance:" + Object.getDistance() + "miles"
				+ "\nmonkey Speed:" + Object.getSpeed() + " mph"
				+ "\nMonkey acceleration:" + Object.getAcceleration());
		//distance traveled recorded
		for (int l = 0; l < 5; l++)
			Object.walk(Object.getDistance());
		for (int l = 0; l < 5; l++)
			System.out.print(Object.Walkhistory()[l] + " miles walked  ");
		System.out.println("\t");
		for (int x = 0; x < 5; x++)
			Object.run(Object.getDistance());
		for (int x = 0; x < 5; x++)
			System.out.print(Object.Runhistory()[x] + " miles ran\t");


		
		
// Human
		Object2.name();
		Object2.talk();
		System.out.println("human age :" + Object2.getAge() + " yrs"
				+ "\nHuman wieght:" + Object2.getWeight() + " lbs"
				+ "\nHuman Distance:" + Object2.getDistance() + "miles"
				+ "\nHuman Speed:" + Object2.getSpeed() + " mph"
				+ "\nHuman acceleration:" + Object2.getAcceleration());

		// distance traveled recorded
		for (int y = 0; y < 5; y++)
			Object2.walk(Object2.getDistance());
		for (int y = 0; y < 5; y++)
			System.out.print(Object2.Walkhistory()[y] + " miles walked  ");
		System.out.println("\t");
		for (int x = 0; x < 5; x++)
			Object2.run(Object2.getDistance());
		for (int x = 0; x < 5; x++)
			System.out.print("\t" + Object2.Runhistory()[x] + " miles ran");


		
		
// Robot
		Object3.name();
		Object3.talk();
		System.out.println("robot age :" + Object3.getAge() + " yrs"
				+ "\nrobot wieght:" + Object3.getWeight() + " lbs"
				+ "\nrobot Distance:" + Object3.getDistance() + "miles"
				+ "\nrobot Speed:" + Object3.getSpeed() + " mph"
				+ "\nrobot acceleration:" + Object3.getAcceleration());

		// distance traveled recorded
		for (int z = 0; z < 5; z++)
			Object3.walk(Object3.getDistance());
		for (int z = 0; z < 5; z++)
			System.out.print(Object3.Walkhistory()[z] + "miles walked\t");
		System.out.println("\t");
		for (int x = 0; x < 5; x++)
			Object3.run(Object3.getDistance());
		for (int x = 0; x < 5; x++)
			System.out.print(Object3.Runhistory()[x] + " miles ran\t");

	}

}




public abstract class Animal {

// encapsulation, do not want user to get direct access to variables

	private int age;
	private int weight;
	private int distance;
	private int speed;
	private int acceleration;

// constructor!!!!!
	
	public Animal(int age, int weight, int distance, int speed, int acceleration) {
		super();
		this.age = age;
		this.weight = weight;
		this.distance = distance;
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

	public int getDistance() {
		return distance;

	}

	public void setDistance(int distance) {
		this.distance = distance;
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
	public int walk(int distance) {
		int step = 0;
		distance = step;
		return (0 + (int) (Math.random() * step));
	}

	// method 3, overridden
	public int run(int distance) {
		int quickness = 0;
		distance = quickness;
		return 0 + (int) (Math.random() * quickness);
	}

}



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
		return a[l++];
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



public class Human extends Animal {

	private int[] a = new int[5];
	private int[] b = new int[5];
	
	private int x;
	private int y;

	public Human(int age, int weight, int distance, int speed, int acceleration) {
		super(age, weight, distance, speed, acceleration);

	}

	public void name() {
		System.out.println("\n\n\nMy name is Mesut Ozil!!");
	}

	public void talk() {
		System.out.println("Hello!");

	}

	public int walk(int distance) {
		int feet;
		feet = distance;
		b[y] = 0 + (int) (Math.random() * feet);
		return b[y++];
	}

	public int run(int distance) {
		int velocity2 = 0;
		velocity2 = distance;
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
