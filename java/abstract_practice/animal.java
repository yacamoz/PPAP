package abstract_practice;

abstract class animals{
	public abstract void sound();
	
	
	//1�� �̻��� �߻�޼ҵ带 ������ Ŭ����=�߻�Ŭ����
}

class lion extends animals{
	public void sound() {
		System.out.println("����");
	}
	
	public void hunt() {
		System.out.printf("�ٸ� ������ ���!");
	}
}

public class animal {

}
