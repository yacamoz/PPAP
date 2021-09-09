package toString;

class AAA{
	private int x;
	private int y;
	
	public AAA(int x, int y ) {
		this.x=x;
		this.y=y;
	}
}

public class ex01 {

	public static void main(String[] args) {
		AAA obj1 = new AAA(1,3);
		AAA obj2 = new AAA(4,5);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
	}

}
