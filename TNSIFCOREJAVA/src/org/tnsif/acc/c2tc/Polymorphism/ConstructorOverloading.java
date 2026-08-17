package org.tnsif.acc.c2tc.Polymorphism;

class Student
{
	String name;
	int age;
	
	Student()
	{
		System.out.println("Default constructoor");
	}
	Student(String name)
	{
		this.name=name;
		System.out.println("Name:"+name);
	}
	Student(String name ,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name:"+name+" Age:"+age);
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Student student = new Student();
		Student st = new Student(" Lavanya");
		Student s = new Student("  Abhikhya" ,  20);
	
				
	}

}