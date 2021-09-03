package ex01;
import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		int dan = 1;
		while(num1<=num2)
		{dan = 1;
			while(dan<10)	
			{System.out.printf("%d x %d = %d\n", num1, dan, num1*dan);
			dan++;	
			}
			num1++;
		}
		sc.close();
	}

}