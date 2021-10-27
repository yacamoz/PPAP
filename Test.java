package cote1;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		int[] a = new int[10000];
		int snum=1;
		ArrayList<Integer> arrSnum = new ArrayList<>();
		for(int i=0;i<10000;i++) {
			a[i]=i+1;
		}
		for(int i=1;i<10000;i++) {
			snum=senum(i);
			arrSnum.add(snum);
		}
		for(int i=0;i<10000;i++) {
			for(int j=0;j<arrSnum.size();j++) {
				if(a[i]==arrSnum.get(j)) {
					a[i]=0;
				}
			}
			if(a[i]!=0) {
				System.out.println(a[i]);
			}
		}
	}
	public static int senum(int num) {
		ArrayList<Integer> arrNum = new ArrayList<>();
		int i=0;
		int arsum=0;
		int num2=num;
		while(num>0) {
			arrNum.add(num %10);
			num /=10;
		}
		while(i<arrNum.size()) {
			arsum+=arrNum.get(i);
			i++;
		}
		return arsum+num2;
	}

}
