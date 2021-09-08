package padlet;

import java.util.Scanner;

public class moonje0505 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp;
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			System.out.printf("숫자 입력:");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.printf("큰수:%d, 작은 수:%d",arr[0],arr[4]);
	}

}
