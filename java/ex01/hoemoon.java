package ex01;

import java.util.Scanner;

public class hoemoon {

	public static void main(String[] args) {
		String str = "";
		String str2 = "level";
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		int len = str.length();
		boolean isDiff=false;//�ٸ��� �ִ°�
		
	for(int i = 0; i<len/2;i++) {
			if(str.charAt(i)==str.charAt(len-1-i)) {}
			else {isDiff=true; break;}
		}
	if (isDiff==false) {System.out.print("�´�");}
	else if(isDiff==true) {System.out.print("�����ʴ�");}
	sc.close();
	}
}
