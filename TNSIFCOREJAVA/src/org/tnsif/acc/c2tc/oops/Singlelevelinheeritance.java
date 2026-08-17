package org.tnsif.acc.c2tc.oops;

class  Course
{
	String courseName=" Java Programming";
	void showCourse() {
		System.out.println("course:"+ courseName);
	}
}

//subclass
class Student extends Course
{
	String studentName=" lavanya";
	void showStudent()
	{
		System.out.println("student name:"+studentName);
	}
}
public class Singlelevelinheeritance{
	public static void main(String[] args) {
		Student student = new Student();
		student.showCourse();
		student.showStudent();
	}
	
}