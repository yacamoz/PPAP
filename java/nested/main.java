package nested;
//ÁßÃ¸ Å¬·¡½º
class outer {
	private int out_num;
	public void outfunc() {
		System.out.println("outfunc");
	}

	class inner {
		private int in_num;
		public void infunc() {
			System.out.println("infunc");
		}
	}
}
public class main {

	public static void main(String[] args) {
		outer out = new outer();
		outer.inner in=out.new inner();

	}

}
