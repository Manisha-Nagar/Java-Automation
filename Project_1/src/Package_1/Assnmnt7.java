package Package_1;

public class Assnmnt7 {
	
	public void m1() {
		//this.m1(56, 6, 6);
		System.out.println("Parent Default Method");
	}
	
	public void m1(int a) {
		//this.m1();
		System.out.println("Parent 1 parameterized Method");
	}
	
	public void m1(int a, int b) {
		//this.m1(4);
		System.out.println("Parent 2 parameterized Method");
	}
	
	public void m1(int a, int b , int c) {
		System.out.println("Parent 3 parameterized Method");
	}
	
	
	public static void main(String[] args) {
	Assnmnt7 obj = new Assnmnt7();
	}
	

}
