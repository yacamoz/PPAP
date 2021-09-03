package ex01;

public class practice2 {

	public static void main(String[] args) {
		int num1 = 1;
		int sum1 = 0;
		int sum2 = 0;
		while(num1<101)
		{
			if (num1%2==0)
				sum1+=num1;
			else if (num1%2>0)
				sum2+=num1;
			
			num1++;
		}
		System.out.printf("짝수의 합은 %d, 홀수의 합은 %d", sum1, sum2);
	}

}
