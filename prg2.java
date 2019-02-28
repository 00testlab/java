package prg2;

abstract class vehicle
{
	String Fuel;
	public vehicle(String fuel)
	{
		this.Fuel=fuel;
	}
	public void fuelstatus(String vehicle)
	{
		System.out.println("This "+vehicle+" fuel tank "+Fuel);
	}
	abstract void topspeed();
}

class Car extends vehicle{
	int speed;
	public Car(String fuel,int carspeed) {
		super(fuel);
		speed=carspeed;
	}
	void topspeed()
	{
		System.out.println("Car runs at "+speed+" km/hr top speed");
	}
}
class Bike extends vehicle{
	int speed;
	public Bike(String fuel,int bikespeed) {
		super(fuel);
		speed=bikespeed;
	}
	void topspeed()
	{
		System.out.println("Bike runs at "+speed+" km/hr top speed");
	}
}

public class prg2 {
	public static void main(String args[])
	{
		Car c1 = new Car("Full",150);
		c1.fuelstatus("Car");
		c1.topspeed();
		Bike b1 = new Bike("Half",100);
		b1.fuelstatus("Bike");
		b1.topspeed();
	}
}
