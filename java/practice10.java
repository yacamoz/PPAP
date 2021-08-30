package ex01;

public class practice10 {

	public static void main(String[] args) {
		int []arr1 = new int [10];
		int i = 0, num=0;
		arr1[0] = 0;
		arr1[1] = 1;
		for(i=2;i<10;i++) {
			num=arr1[i-1]+arr1[i-2];
			arr1[i]=num;
		}
		for(i=0;i<10;i++) {
		System.out.printf("%d ", arr1[i]);}
	}

}
