package ex01;
import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		int i=0, num=0, sum=0, avg=0;
		for(i = 0; i<3; i++) {
			System.out.print("점수 입력:");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		arr[3]=sum;
		arr[4]=sum/3;
		for(i=0;i<5;i++) {
		System.out.printf("%d ", arr[i]);}
	}

}
