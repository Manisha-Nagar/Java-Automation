package Package_1;

public class Assignment4 {
	
	public Assignment4() {
		this(0, 1, 2	, 3);
	 System.out.println("Default constructor");
	}

	
	public Assignment4(int a) {
		this();
		 System.out.println("One parameterized constructor");
		}

	public Assignment4(int a,int b) {
		this(29,30,31);
		 System.out.println("Two parameterized constructor");
		}
	public Assignment4(int a,int b, int c) {
		this(12);
		 System.out.println("Three parameterized constructor");
		}
	public Assignment4(int a,int b, int c, int d) {
		 System.out.println("Four parameterized constructor");
		}
	
	public static void main(String[] args) {
		Assignment4 obj = new Assignment4(22,44);
		
	}
}
