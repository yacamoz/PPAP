package padlet;

import java.util.Scanner;

public class moonje0305 {

	public static void season(int num) {
		if (num==12&&num<=2) {
			System.out.print("겨울");
		}
		else if (num>=3&&num<=5) {
			System.out.print("봄");
		}
		else if (num>=6&&num<=8) {
			System.out.print("여름");
		}
		else {
			System.out.print("가을");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.print("몇월이야");
		num=sc.nextInt();
		season(num);
	}

}
