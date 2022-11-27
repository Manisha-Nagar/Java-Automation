package Package_1;

public class Assgnmnt6 {
	
	public Assgnmnt6() {
		// TODO Auto-generated constructor stub
		this(4, 6, 9);
		System.out.println("Parent Default Constructor");
		
	}
	
	public Assgnmnt6(int a) {
		// TODO Auto-generated constructor stub
	    this();
	   System.out.println("Parent 1 parameterized constructor");
		
	}
	
	
	
	public Assgnmnt6(int a, int b) {
		// TODO Auto-generated constructor stub
		this(1);
		System.out.println("Parent 2 parameterized constructor");
		
	}
	
	public Assgnmnt6(int a,int b, int c) {
		// TODO Auto-generated constructor stub
		System.out.println("Parent 3 parameterized constructor");
		
} 
	
	
	
	public static void main(String[] args) {
		Assgnmnt6 ob = new Assgnmnt6();
		
	}
	
	
	


}
