package padlet;

public class moonje0401 {
	
	public static int daplus() {	
		int num=0;
		for(int i=1;i<101;i++) {
		num+=i;
	}
		return num;
}

	public static void main(String[] args) {
		
		System.out.printf("100까지의 합:%d", daplus());
	}

}
