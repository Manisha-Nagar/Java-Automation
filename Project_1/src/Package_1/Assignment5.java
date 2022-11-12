package Package_1;

public class Assignment5 {
	
	public void method() {
		System.out.println("Calling default method");
		}
	
	public void method1(int a) {
		System.out.println("Calling one parameterized method");
		
	}
	
	public void method2(int a, int b) {
		this.method3(1, 2, 3);
	    this.method();
		this.method4(2,8,5,6);
        this.method1(5);
        System.out.println("Calling two parameterized method");
 
	}
	
    public void method3(int a, int b, int c) {
    	System.out.println("Calling three parameterized method");
	}
    
    public void method4(int a, int b , int c, int d) {
    	System.out.println("Calling four parameterized method");
	}
    
    public static void main(String[] args) {
		Assignment5 obj = new Assignment5();
		obj.method2(1,2);
	}
}
