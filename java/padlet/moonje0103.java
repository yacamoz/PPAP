package padlet;

import java.util.Scanner;

public class moonje0103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.print("이름을 입력하세요:");
		name=sc.next();
		System.out.print("나이를 입력하세요:");
		age=sc.nextInt();
		System.out.printf("이름:%s, 나이:%d 다음에 뵙겠습니다", name, age);
		
		sc.close();
	}

}
