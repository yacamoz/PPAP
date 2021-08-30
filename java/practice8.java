package ex01;
import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0, i=0;
		int []arr= new int[9] ;
		
		for(i = 0; i < 9; i++)
		{System.out.print("구구단 입력:");
		num1 = sc.nextInt();
		arr[i]=num1;
		}
		
		for(i = 0; i<9;i++)
			{System.out.printf("%d ", arr[i]);
			}

		sc.close();
	}

}
