package padlet;

import java.util.Scanner;

public class moonje0103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.print("�̸��� �Է��ϼ���:");
		name=sc.next();
		System.out.print("���̸� �Է��ϼ���:");
		age=sc.nextInt();
		System.out.printf("�̸�:%s, ����:%d ������ �˰ڽ��ϴ�", name, age);
		
		sc.close();
	}

}
