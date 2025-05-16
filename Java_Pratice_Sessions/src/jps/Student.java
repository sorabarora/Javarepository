package jps;

public class Student {
	
	int age;
	int rollno;
	
	public void study()
	{
		System.out.println("I am doing the study");
	}
	
	public void play()
	{
		System.out.println("I am playing football");
	}
	
	public static void main(String[] args) {
		
		Student Stephen=new Student();
		Stephen.age=25;
		Stephen.rollno=154;
		Stephen.study();
		Stephen.play();
		System.out.println("The age is "+Stephen.age);
		System.out.println("The rollno is "+Stephen.rollno);
		
		Student Manisha=new Student();
		Manisha.age=28;
		Manisha.rollno=178;
		Manisha.study();
		Manisha.play();
		System.out.println("The age is "+Manisha.age);
		System.out.println("The rollno is "+Manisha.rollno);
		
	}
	
	

}
