package Package_1;

public class Maruti {

	int number;
	String color;
	
	public void color() {
		
		color = "Black";
		System.out.println("color of Maruti "+color);
		
		
	}
	
	public void number(int b) {
		number = b;
		System.out.println("number of Maruti "+number);
		
	}
	
	public static void main(String[] args) {
		Maruti m = new Maruti();
		m.color();
		m.number(8208);
		
	}
	
}
