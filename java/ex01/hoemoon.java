package ex01;

import java.util.Scanner;

public class hoemoon {

	public static void main(String[] args) {
		String str = "";
		String str2 = "level";
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		int len = str.length();
		boolean isDiff=false;//다른게 있는가
		
	for(int i = 0; i<len/2;i++) {
			if(str.charAt(i)==str.charAt(len-1-i)) {}
			else {isDiff=true; break;}
		}
	if (isDiff==false) {System.out.print("맞다");}
	else if(isDiff==true) {System.out.print("맞지않다");}
	sc.close();
	}
}
