package padlet;

import java.util.Scanner;

public class moonje0105 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String input;
	 System.out.print("�Է�:");
	 input = sc.next();
	 char[] carr=new char[input.length()];
	 for(int i=0; i<input.length();i++) {
		 for(int j=0; j<input.length();j++) {
			 if(input.charAt(i)==input.charAt(j)&&i==j) {
				 System.out.printf("'%s'�� %d��°���� ó�� �����մϴ�\n", input.charAt(j), j+1);
			break;
			 }
			 else if(input.charAt(i)==input.charAt(j))
				 break;
			 }
			 
		 }
	 }
	
	

}
