package interface_class;

//�ش����� ������ �߻�Ŭ����
//�������̽��� �߻�޼ҵ常 ���
interface EnemyController{
	public int ch = 30;//�̷��� �� ���� ����
	public static final int capacity=1;
	public abstract void left();
	public abstract void right();
	
}

class blueeyeswhitedragon implements EnemyController {
	public void left() {
		System.out.printf("�������� �̵��Ѵ�\n");
	}
	public void right() {
		System.out.print("���������� �̵��Ѵ�\n");
	}
}

public class main {

	public static void main(String[] args) {
		blueeyeswhitedragon bwd = new blueeyeswhitedragon();
		bwd.left();
		bwd.right();
	}
}
