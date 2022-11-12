package Package_1;


public class Student {
	int rollno, age;
	
	public void display1() {
		System.out.println("welcome to all of you");
		}
	
			public void display2() {
				System.out.println("Automation is very easy");
				
			}
			
			public static void main(String[] args) {
				Student s = new Student();
				s.display1();
				s.display2();
			    s.rollno = 42;
			    s.age = 25;
				System.out.println("roll no. is"+ s.rollno);
				System.out.println("age is"+ s.age);
				
			}

}
