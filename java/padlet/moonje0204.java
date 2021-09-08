package padlet;

import java.util.Scanner;

public class moonje0204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char[] hrr = {'ぁ','い','ぇ','ぉ','け','げ','さ','し','じ','ず','せ','ぜ','そ','ぞ','た',
				'ち','っ','づ','で','に','ぬ','ば','ぱ','び'};
		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','n','m','o',
				'p','q','r','s','t','u','v','w','x'};
		System.out.print("脊径:");
		str=sc.next();
		for(int j=0;j<str.length();j++) {
			for(int i=0;i<arr.length;i++) {
				if(str.charAt(j)==arr[i]) {
					System.out.printf("%c",hrr[i]);
				}
			}
		}
	}

}
