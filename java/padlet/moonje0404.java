package padlet;

public class moonje0404 {
	
	public static void hms(int num ) {
		int hour, minute, second;
		hour=num/3600;
		minute=(num%3600)/60;
		second=((num%3600)%60);
		System.out.printf("%d�ð� %d�� %d��", hour,minute,second);
	}

	public static void main(String[] args) {
		hms(3601);
	}

}
