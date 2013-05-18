FinalProject
============
public class Bi_Pedmain {
  public static void main(String args[]) {
//objects
		Monkey Object = new Monkey(7, 75,10,50,20);
		Human Object2 = new Human(21, 170,26,15,5);
		Robot Object3 = new Robot(9, 55,10,45,15);
//Monkey
		Object.name();
		Object.talk();
		System.out.println("monkey age :" + Object.getAge() + " yrs"
				+"\nMonkey wieght:" + Object.getWeight() + " lbs"
				+"\nMonkey Distance:"+Object.getRunningdistance()+"miles"
				+ "\nmonkey Speed:" + Object.getSpeed() + " mph"
				+ "\nMonkey acceleration:"+Object.getAcceleration());
		System.out.println("walked:"+ Object.walk(Object.getRunningdistance())+" miles");
		System.out.println("ran:"+ Object.run(Object.getSpeed())+" miles"+"\n"+"\n");

//Human
		Object2.name();
		Object2.talk();
		System.out.println("human age :" + Object2.getAge() + " yrs"
				+ "\nHuman wieght:" + Object2.getWeight() + " lbs"
				+"\nHuman Distance:"+Object2.getRunningdistance()+"miles"
				+ "\nHuman Speed:" + Object2.getSpeed() + " mph"
				+ "\nHuman acceleration:"+Object2.getAcceleration());
		
		System.out.println("walked:"+Object2.walk(Object2.getRunningdistance())+" miles");
		System.out.println("ran:"+Object2.run(Object2.getSpeed())+" miles"+"\n"+"\n");
//Robot
		Object3.name();
		Object3.talk();
		System.out.println("robot age :" + Object3.getAge() + " yrs"
				+ "\nrobot wieght:" + Object3.getWeight() + " lbs"
				+"\nrobot Distance:"+Object3.getRunningdistance()+"miles"
				+ "\nrobot Speed:" + Object3.getSpeed() + " mph"
				+ "\nrobot acceleration:"+Object3.getAcceleration());
		System.out.println("walked:"+Object3.walk(Object3.getRunningdistance())+"miles");
		System.out.println("ran:"+Object3.run(Object3.getSpeed())+"miles"+"\n"+"\n");

	}

}






public abstract class Animal {
  //encapsulation, do not want user to access variables. Do not want to give user direct access
	private int age;
	private int weight;
	private int runningdistance;
	private int speed;
	private int acceleration;
	private int []a;
	private int x;

	
	//public String Properties(){
	//	String details = "age:"+this.age+"weight:"+this.weight+"speed:"+this.speed+"acceleration:"+this.acceleration;
	//return details;
	//}
	
	//constructor!!!!!
	public Animal(int age, int weight,int runningdistance, int speed,int acceleration) {
		super();
		this.age = age;
		this.weight = weight;
		this.runningdistance=runningdistance;
		this.speed = speed;
		this.acceleration=acceleration;
		
	}
//user gets access to variables through set and get methods(I used source and get set method)
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

	public int getRunningdistance(){
		return runningdistance;
		
	}
	public void setRunningdistance(int runningdistance){
		this.runningdistance =runningdistance;
	}
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setAcceleration(int acceleration){
		this.acceleration= acceleration;	
	}
	public int getAcceleration(){
		return acceleration;
	}
	//overridden property 
	public void name() {
		System.out.println("UNknown name!");
	}
// method 1, overridden
	public void talk() {
		System.out.println("cannot talk!");
	}
//method 2, overridden
	public int walk(int walkingdistance) {
		int step=0;
		walkingdistance=step;
		return  (0+ (int) (Math.random() * step));
	}
//method 3, overridden
	public int run(int runningdistance) {
		int quickness=0;
		runningdistance=quickness;
	a[x]=0 + (int) (Math.random() * quickness);
		return a[x++];
	}
//Run movement history
	public int[]Runhistory(){
		return a;
	}

}



public class Human extends Animal {
  
	int[]a;
	int x;
	
	public Human(int age, int weight,int runningdistance, int speed, int acceleration) {
		super(age, weight,runningdistance, speed, acceleration);
		
	}

	public void name() {
		System.out.println("My name is Mesut Ozil!!");
	}

	public void talk() {
		System.out.println("Hello!");

	}
	public int walk(int runningdistance){
		int feet;
		feet=runningdistance;
		return (0 + (int) (Math.random() * feet));
		
	}
	public int run(int runningdistance) {
		int velocity2=0;
		velocity2=runningdistance;
		a[x]=0 + (int) (Math.random() * velocity2);
		return a[x++];
	}
	//Run movement history
		public int[]Runhistory(){
			return a;
		}
}





public class Monkey extends Animal {

  int[]a;
	int x;
	
	public Monkey(int age, int weight,int runningdistance, int speed, int acceleration) {
		super(age, weight, runningdistance,speed, acceleration);

	}

	public void name() {
		System.out.println("aaah ooh ooooh(my name is George)!");
	}

	public void talk() {
		System.out.println("Oooh ooh aah aaah!");
	

	}
	public int walk(int runningdistance){
		int paw;
		paw=runningdistance;
		return (0 + (int) (Math.random() * paw));
	}
	public int run(int speed) {
		int velocity;
		velocity=speed;
		a[x]=0 + (int) (Math.random() * velocity);
		return a[x++];
		}
		
	
	public int[]Runhistory(){
		return a;
		}
}





public class Robot extends Animal {
  int []a;
	int x;
	public Robot(int age, int weight, int runningdistance,int speed, int acceleration) {
		super(age, weight,runningdistance, speed,acceleration);

	}

	public void name() {
		System.out.println("My name is E-102 GAM-MA.");
	}

	public void talk() {
		System.out.println("HEL-LO.");

	}
	public int walk(int runningdistance){
		int metalfeet;
		metalfeet=runningdistance;
		return (0 + (int) (Math.random() *metalfeet));
		}
	public int run(int runningdistance) {
		int velocity3=0;
		velocity3=runningdistance;
		a[x]=0 + (int) (Math.random() * velocity3);
		return a[x++];
		
	}
	public int[]Runhistory(){
		return a;
		}
}
