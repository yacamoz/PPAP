package stringbuilder;

public class stringbuilder {

	public static void main(String[] args) {		
		StringBuilder sb=new StringBuilder("Çª¸¥");
		sb.append("ÀÚ¹Ù");
		System.out.println(sb+": "+sb.capacity());
		sb.trimToSize();
		System.out.println(sb+": "+sb.capacity());

	}
	
	static void printStringBuilder(StringBuilder sb) {
		String str = sb.toString();
		int len = sb.length();
		int bufsize = sb.capacity();
		System.out.printf("%s(%d):%d %n", str, len,bufsize);
	}
}


