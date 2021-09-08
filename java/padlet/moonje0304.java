package padlet;

public class moonje0304 {
	public static int daplus1() {	
		int num=0;
		for(int i=1;i<101;i++) {
			if (i%3==0) {
				continue;
			}
			else {
				num+=i;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.printf("гу:%d",daplus1());
	}
}
