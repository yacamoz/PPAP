package ex01;

class Student
{
	private String name;
	private int grade;
	private double score;
	
	Student() {
		System.out.println("디폴트 생성자");
	}
	
	Student(String name, int grade, double score){
		System.out.println("입력이 String, int, double 생성자");
		this.name = name;
		this.grade=grade;
		this.score=score;
	}
	
	void showinfo() {
		System.out.printf("이름:%s\n", name);
		System.out.printf("학년:%d\n", grade);
		System.out.printf("성적:%.1f\n", score);
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
		Student s1 = new Student("이민호", 4, 95);
		Student s2 = new Student("정채연", 2, 94);
		
		s1.showinfo();
		s2.showinfo();

	}

}
