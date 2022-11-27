package Package_1;

public class childAssnmnt7 extends Assnmnt7 {
	
	public void m() {
		this.m(2, 3);
		System.out.println("child default method");
		
	}
	public void m(int a) {
		
		super.m1(4, 5, 6);
		super.m1();
		super.m1(1);
		super.m1(9, 10);
		System.out.println("child 1 paraameterized  method");
		
	}

	public void m(int a, int b) {
		this.m(1,2,3);
		System.out.println("child 2 parameterized method");
		
	}

	public void m(int a, int b , int c) {
		this.m(8);
		System.out.println("child 3 parameterized method");
		
	}
	
	public static void main(String[] args) {
		childAssnmnt7 obj = new childAssnmnt7();
		obj.m();
		
	}

	
	
	
	
}
