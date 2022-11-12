package Package_1;

public class Airthmetic {
	int a, b;
	
	public int sum(int a,int b) {
		int c;
		c = a+b;
		System.out.println("sum is "+c);
		return c;
		
	}
    public int sub(int a , int b) {
     int c;
     c= a-b;
     System.out.println("After sub is "+c);
     return c;
   
   }
    
    public int mul( int a,int b) {
    	int c;
    	c= a*b;
    	 System.out.println("After mul is "+c);
    	return c;
		
	}
    public int div( int a,int b) {
    	int c;
    	c= a/b;
    	 System.out.println("After div is "+c);
    	return c;
		
	}
    public void result (int a) {
    	System.out.println("final result is "+a);
    }
    
    public static void main(String[] args) {
		Airthmetic ob = new Airthmetic();
		int res1 = ob.sum(10,4);
		int res2 =ob.sum(res1,2);
		int res3 = ob.sub(res2,2);
		int res4 = ob.mul(res3,2);
		int res5 = ob.div(res4,2);
		ob.result(res5);
		}
    
}
