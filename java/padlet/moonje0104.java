package padlet;

class cat {
	String name;
	String gender;
	int age;
	
	public cat() {
		name = "������";
		gender="����";
		age=0;
	}
	public cat(String name, String gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public void catinfo() {
		System.out.printf("����� �̸�:%s\n", name);
		System.out.printf("����� ����:%s\n", gender);
		System.out.printf("����� ����:%d\n", age);
	}
}

public class moonje0104 {

	public static void main(String[] args) {
		cat c1 = new cat("�����", "����", 5);
		cat c2 = new cat("������", "����", 4);
		c1.catinfo();
		c2.catinfo();
	}

}
