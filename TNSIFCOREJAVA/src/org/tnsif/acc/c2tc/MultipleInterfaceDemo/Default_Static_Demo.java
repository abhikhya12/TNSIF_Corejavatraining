package org.tnsif.acc.c2tc.MultipleInterfaceDemo;

interface Vehicle
{
	public abstract void start();
	public abstract void stop();
	final static int max_speed = 120;
	
	default void  repair()
	{
		System.out.println("vehicle repair is done");
	}
	static void checkMaintanance()
	{
		System.out.println("vehicle maintanance take care here");
	}
}
class Car implements Vehicle
{
	private String model;
	
	Car(String model)
	{
		this.model = model;
	}
	
	public void start() {
		System.out.println("car "+model+"starting");
	}
	public void stop() {
		System.out.println("car "+model+"stopping");
	}
}
class Bike implements Vehicle
{
	private String type;
	
	Bike(String model)
	{
		this.type = model;
	}
	
	public void start() {
		System.out.println("car "+type+"starting");
	}
	public void stop() {
		System.out.println("car "+type+"stopping");
	}
}

public class Default_Static_Demo {
	public static void  main(String[] args) {
		Vehicle  car = new Car("Nexon");
		Vehicle bike = new Bike("Royal enf");
		
		car.start();
		car.stop();
		car.repair();
		System.out.println("_________________");
		bike.start();
		bike.stop();
		bike.repair();
		System.out.println("_________________");
		Vehicle.checkMaintanance();
		System.out.println("Maxspeed "+Vehicle.max_speed);
		}


}