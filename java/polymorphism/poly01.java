package polymorphism;

//polymorphism:������
//poly�� ����
//�ڽ� Ÿ�� ������ �θ� ��ü�� ���� �� ����, �θ� Ÿ�� ������ �ڽ� ��ü�� ���� �� �ִ�.
//dog d = new animal();-> �Ұ���, animal ani = new dog();->����
//�������� ������ �θ� Ÿ���� ������ �ڽ��� ��ü�� ��밡���ϴ�.
class animal{
	public void sound() {
		System.out.println("�����Ҹ� ��!");
	}
}

class cat extends animal {
	public void sound() {
		System.out.println("�Ͼƿ�");
	}
}

class dog extends animal {
	public void sound() {
		System.out.println("��������0");
	}
}

public class poly01 {

	public static void main(String[] args) {
		animal ani = null; //����
		animal anr[]=new animal[3];
		anr[0]=new dog();
		anr[1]=new cat();
		anr[2]=new dog();
		for(int i=0;i<3;i++) {
			anr[i].sound();
		}
	}

}
