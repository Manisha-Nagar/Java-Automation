package Package_1;

public class ChildAssmnt6 extends Assgnmnt6 {

	public ChildAssmnt6() {
		// TODO Auto-generated constructor stub
		this(4, 2);
		System.out.println("Default child constructor");
	}
	public ChildAssmnt6(int a) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("1 Parameterized child constructor");
	}
	
	public ChildAssmnt6(int a ,int b) {
		// TODO Auto-generated constructor stub
	     super(5,8);
		System.out.println("2 Parameterized child constructor");
	}
	
	public ChildAssmnt6(int a, int b, int c ) {
		// TODO Auto-generated constructor stub
		this(1);
		System.out.println("3 parameterized  child constructor");
	}
	
		public static void main(String[] args) {
		ChildAssmnt6 ob = new ChildAssmnt6(2,4,8);
		
	}
	
	
	
	
	
	
	
}
