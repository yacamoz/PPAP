package ex01;

class Student
{
	private String name;
	private int grade;
	private double score;
	
	Student() {
		System.out.println("����Ʈ ������");
	}
	
	Student(String name, int grade, double score){
		System.out.println("�Է��� String, int, double ������");
		this.name = name;
		this.grade=grade;
		this.score=score;
	}
	
	void showinfo() {
		System.out.printf("�̸�:%s\n", name);
		System.out.printf("�г�:%d\n", grade);
		System.out.printf("����:%.1f\n", score);
	}
	void setgrade(int grade) {
		this.grade = grade;
	}
	int getgrade() {
		return grade;
	}
	void setname(String name) {
		this.name = name;
	}
	void getname() {
		return name;
	}
}

public class classex01 {

	public static void main(String[] args) {
		Student s1 = new Student("�̹�ȣ", 4, 95);
		Student s2 = new Student("��ä��", 2, 94);
		
		s1.showinfo();
		s2.showinfo();

	}

}
