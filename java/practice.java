package ex01;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int num1 = sc.nextInt();
	if(num1%2==0)
		System.out.println("¦���Դϴ�");
	else if(num1%2>0)
		System.out.println("Ȧ���Դϴ�");
	
	sc.close();
	}
}
