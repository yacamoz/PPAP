package ex01;
import java.util.Scanner;
public class practice9 {

	public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);
     	double num1 = 0, avg=0;
		double []arr = new double[3];
		for(int i = 0; i <3; i++) {
		System.out.print("온도 입력:");
		num1=sc.nextDouble();
		arr[i]=num1;
		avg+=num1;
		}   
		
		System.out.printf("평균온도 %.2f", avg/3);
 		sc.close();
	}

}
