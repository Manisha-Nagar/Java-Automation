package Package_1;

public class Assgnmnt {

	int a=555;
	
	public void m1(int a) {
		
		this.a= a;
}
	
 public static void main(String[] args) {
	
	 Assgnmnt ob = new Assgnmnt();
	 ob.m1(123);
	 System.out.println("value of a "+ ob.a);
}	
}
