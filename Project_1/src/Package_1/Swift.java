package Package_1;

public class Swift extends Maruti {

	int num ;
	String colour ;
	
	public void num(int b) {
		num = b;
		System.out.println("number of swift "+num);
	}
	
	public void colour() {
		colour = "Green";
		System.out.println("colour of swift "+colour);
		
	}
	
	public static void main(String[] args) {
		Swift s = new Swift();
		s.color();
		s.number(8208);
		s.num(9900);
		s.colour();
		
	}
	
}
