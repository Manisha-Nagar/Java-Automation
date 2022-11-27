package Package_1;

import java.util.Scanner;

public class Assignment8 {
	
	public int sum(int a, int b) {
		int c;
		c = a+b ;
		return c;
		
	}
	
	public int sub(int a, int b) {
		int c;
		c = a-b ;
		return c;
		
	}
	public int mul(int a, int b) {
		int c;
		c = a*b ;
		return c;
		
	}
	public int div(int a, int b) {
		int c;
		c = a/b ;
		return c;
		
	}
	
	public static void main(String[] args) {
		
		Assignment8 obj = new Assignment8();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of a & b");
		int a = s.nextInt();
		int b = s.nextInt();
		int sumresult= obj.sum(a, b);
		System.out.println(" Result is" +sumresult);
		
		System.out.println("Enter the value of c");
		int c = s.nextInt();
		int sumresult2=obj.sum(sumresult, c);
		System.out.println("Result is" +sumresult2);
		
		
		System.out.println("Enter the value of d");
		int d = s.nextInt();
		int subresult=obj.sub(sumresult2, d);
		System.out.println("Result is" +subresult);
		
		System.out.println("Enter the value of e");
		int e = s.nextInt();
		int mulresult=obj.mul(subresult, e);
		System.out.println("Result is" +mulresult);

		
		System.out.println("Enter the value of f");
		int f = s.nextInt();
		int finalresult = obj.div(mulresult, f);
		System.out.println("Final result is" +finalresult);
			
}
	
	

}
