package Package_1;

public class Baleno extends Swift {

	int numb ;
	String color;
	
	public void numb(int a) {
		numb = a;
		System.out.println("number of baleno "+numb);
		}
	
	public void color_b() {
		color = "Grey";
		System.out.println("color of baleno "+color);
	}
	
	public static void main(String[] args) {
		Baleno b  = new Baleno();
		b.color_b();
		b.numb(5378);
		b.colour();
		b.num(5888);
		b.color();
		b.number(6666);
		
		
		
	}
}
