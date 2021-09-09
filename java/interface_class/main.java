package interface_class;

//극단적인 형태의 추상클래스
//인터페이스는 추상메소드만 사용
interface EnemyController{
	public int ch = 30;//이런건 잘 쓰지 않음
	public static final int capacity=1;
	public abstract void left();
	public abstract void right();
	
}

class blueeyeswhitedragon implements EnemyController {
	public void left() {
		System.out.printf("왼쪽으로 이동한다\n");
	}
	public void right() {
		System.out.print("오른쪽으로 이동한다\n");
	}
}

public class main {

	public static void main(String[] args) {
		blueeyeswhitedragon bwd = new blueeyeswhitedragon();
		bwd.left();
		bwd.right();
	}
}
