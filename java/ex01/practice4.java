package ex01;
import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		int num1 = 1;
		System.out.println("정수를 입력하세요:");
		while(num1 != 0)
		{num1 = sc.nextInt();
		sum += num1;
		}
		System.out.printf("입력한 값의 총합은 %d", sum);
		sc.close();
	}

}
