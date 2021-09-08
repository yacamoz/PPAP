package padlet;

import java.util.Scanner;

public class moonje0205 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num=0;
		 String str;
		 System.out.print("입력:");
		 str = sc.next();
		 char[] srr=new char[str.length()];
		 for(int i=0;i<str.length();i++) {
			 srr[i]=str.charAt(i);
		 }
		 for(int i=0;i<str.length();i++) {
			 num=0;
			for(int j=0;j<str.length();j++) { 
				if(str.charAt(i)==srr[j]) {
					num++;
					srr[j]=' ';
				}
			}
			if(num==0) {continue;}
			System.out.printf("%c는 %s글자 입니다\n", str.charAt(i),num);	
		 }
		}
	}

