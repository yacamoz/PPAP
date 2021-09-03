package inheritance;

class myperson{
	String name;
	int age;
	double height;
	
	public myperson() {
		name="ȫ�浿";
		age=0;
		height = 0;
	}
	public myperson(String name, int age, double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public void introduce() {
		System.out.printf("�̸�:%s\n", name);
		System.out.printf("����:%d\n", age);
		System.out.printf("Ű:%.1f\n", height);
	}
	
	public int getAGE() {
		return age;
	}
	public void setAGE(int age) {
		this.age=age;
	}
}

class mystudent extends myperson{
	private int scnum;
	private int grade;
	private String depart;
	private double gpa;
	
	public mystudent() {
		scnum=100;
		grade=0;
		depart="¥������";
		gpa=0;
	}
	public mystudent(String name, int age, double height, int scnum, int grade, String depart, double gpa) {
		super(name, age, height);
		this.scnum=scnum;
		this.grade=grade;
		this.depart=depart;
		this.gpa=gpa;
	}
	public void introduce() {
		super.introduce();
		System.out.printf("�й�:%d\n", scnum);
		System.out.printf("�г�:%d\n", grade);
		System.out.printf("����:%s\n", depart);
		System.out.printf("����:%.1f\n", gpa);
	}
	public void graduate() {
		if(gpa>=150) {
			System.out.printf("��������");
		}
		else {
			System.out.print("��������");
		}
	}
}


public class ex06 {

	public static void main(String[] args) {
		mystudent[] starr = new mystudent[3];
		starr[0] = new mystudent("������", 25, 170, 5252, 4, "����������", 149);
		starr[1] = new mystudent("��ƿ��", 28, 173, 8282, 3, "��������", 165);
		starr[2] = new mystudent("��Ƽ����", 35, 180, 8090, 5, "Ż����", 155);
	starr[0].graduate();
	starr[1].graduate();
	starr[2].graduate();
	}

}
