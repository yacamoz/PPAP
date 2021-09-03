package ex01;

public class practice5 {

	public static void main(String[] args) {
		int num1=2;
		int dan = 1;
		while(num1<10)
		{dan = 1;
		if(num1%2==0)
			{while(dan<10)	
			{System.out.printf("%d x %d = %d\n", num1, dan, num1*dan);
			dan++;	
			}}
			num1++;
		}

	}

}
