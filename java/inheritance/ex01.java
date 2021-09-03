package inheritance;

class AAA{
	public int A_num1;
	public void AAA_fun() {
		System.out.println("AAA");
	}
}

class BBB extends AAA{
	public int B_num;
}

class CCC extends AAA{
	public int C_num;
}

public class ex01 {

	public static void main(String[] args) {

		BBB b = new BBB();
		
	}

}
