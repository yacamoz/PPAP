package ex01;

public class ex13 {

	public static void main(String[] args) {
		System.out.printf("입력된 값의 답:%d\n", add(3));
		System.out.printf("이거는 %d\n", myabs(-4));
		System.out.printf("약수는 %d\n", yaksu(6,9));
		System.out.printf("배수는 %d\n", baesu(6,9));
		System.out.printf("계산결과 %.2f원", calcul(20,1000,1.09));
	}
	public static int add(int n1) {
		int result = 0;
		result = n1*n1;
		return result;
		// static을 붙인 메서드는 객체 생성 안해도 된다.
		// new 이런거 안붙여도 된다.
		// public이 있는건 접근 제어 지시자.
		// static은 메모리에 가장 먼저 생성이란 뜻.
		
	}
	public static int myabs(int num) {
		if(num>=0)
			return num;
		else
			return -num;
	}
	public static int yaksu(int n1, int n2) {
		int num = 0, result = 0, i = 0;
		if(n1>n2) {
			num = n1;}
		else if (n1<n2) {
			num = n2;}
		for(i = 1; i<num; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				result = i;}
		}
		return result;
	}
	public static int baesu(int n1, int n2) {
		int num1=0, num2=0, result = 0, result2 = 0;
		if (n1>n2) {
			num1=n1;
			num2 = n2;}
		else if (n1<n2) {
			num1 = n2;
			num2 = n1;}
		for(int i = 1; i<=num2; i++) {
			result = num1*i;
			for(int j = 1; j<=num1; j++) {
				result2 = num2*j;
				if(result2==result)
					break;
			}
			if (result == result2)
				break;
		}
		return result;
	}
	public static void sosu(int n1) {
		for (int i = 1; i<n1&&i>1; i++)
			if (n1%i==0) {
				 System.out.println("소수가 아니다");
				 return;}
			else {
				 System.out.println("소수이다");
				 return;}
				
	}
	public static double calcul(int year, int capital, double iza) {
		double result = 0;
		result = capital*iza;
		for(int i = 0; i<year; i++) {
			if (i%10!=0)
			result*=iza;
			else if(i%10==0)
				result=result*0.81;
		}
		return result;
	}
}
