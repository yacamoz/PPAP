package randomex;

import java.util.Random;

public class randex01 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = 0;
		for(int i = 0; i<5; i++) {
		num=rand.nextInt(3)+1;
		System.out.printf("%d", num);
		}

	}

}
