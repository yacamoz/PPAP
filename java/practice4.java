package ex01;
import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		int num1 = 1;
		System.out.println("������ �Է��ϼ���:");
		while(num1 != 0)
		{num1 = sc.nextInt();
		sum += num1;
		}
		System.out.printf("�Է��� ���� ������ %d", sum);
		sc.close();
	}

}
