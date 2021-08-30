package ex01;
import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, i = 1, sum = 0;
		System.out.print("정수를 입력하시오:");
		num1=sc.nextInt();
		while(i<=num1/2)
			{
			if(num1%i==0)
				{sum += i;}
			i++;
			}
		if(sum==num1)
			System.out.printf("%d는 완전수입니다", num1);
		else
			System.out.printf("%d는 완전수가 아닙니다", num1);
		
		sc.close();
	}
}