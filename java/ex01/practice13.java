package ex01;

public class practice13 {

	public static void main(String[] args) {
		int []arr = new int[10];
		for(int i = 0; i<10; i++) {
			if (i<2) {
				arr[i] = i;
			}
			else {
			arr[i] = arr[i-1]+arr[i-2];
			}
		}
		for(int i = 0; i<10; i++) {
			System.out.printf("%d ", arr[i]);
		}

	}

}
