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
				+ "\nMonkey Distance:" + Object.getRunningdistance() + "miles"
				+ "\nmonkey Speed:" + Object.getSpeed() + " mph"
				+ "\nMonkey acceleration:" + Object.getAcceleration());
		//distance traveled recorded
		for (int l = 0; l < 4; l++)
			Object.walk(20);
		for (int l = 0; l < 4; l++)
			System.out.print(Object.Walkhistory()[l] + " miles walked\t ");
		System.out.println("\t");
		for (int x = 0; x < 5; x++)
			Object.run(20);
		for (int x = 0; x < 5; x++)
			System.out.print(Object.Runhistory()[x] + " miles ran\t");

		
		
		
		
		
		
		// Human
		Object2.name();
		Object2.talk();
		System.out.println("human age :" + Object2.getAge() + " yrs"
				+ "\nHuman wieght:" + Object2.getWeight() + " lbs"
				+ "\nHuman Distance:" + Object2.getRunningdistance() + "miles"
				+ "\nHuman Speed:" + Object2.getSpeed() + " mph"
				+ "\nHuman acceleration:" + Object2.getAcceleration());

		// distance traveled recorded
		for (int y = 0; y < 4; y++)
			Object2.walk(26);
		for (int y = 0; y < 4; y++)
			System.out.print(Object2.Walkhistory()[y] + " miles walked\t ");
		System.out.println("\t");
		for (int x = 0; x < 5; x++)
			Object2.run(26);
		for (int x = 0; x < 5; x++)
			System.out.print("\t" + Object2.Runhistory()[x] + " miles ran");

		
		
		
		
		
		
		
		
		
		// Robot
		Object3.name();
		Object3.talk();
		System.out.println("robot age :" + Object3.getAge() + " yrs"
				+ "\nrobot wieght:" + Object3.getWeight() + " lbs"
				+ "\nrobot Distance:" + Object3.getRunningdistance() + "miles"
				+ "\nrobot Speed:" + Object3.getSpeed() + " mph"
				+ "\nrobot acceleration:" + Object3.getAcceleration());

		// distance traveled recorded
		for (int z = 0; z < 4; z++)
			Object3.walk(15);
		for (int z = 0; z < 4; z++)
			System.out.print(Object3.Walkhistory()[z] + "miles walked\t");
		System.out.println("\t");
		for (int x = 0; x < 5; x++)
			Object3.run(15);
		for (int x = 0; x < 5; x++)
			System.out.print(Object3.Runhistory()[x] + " miles ran\t");

	}

}
