package padlet;

class student{
	private String name;
	private int scnum;
	private String gender;
	
	public student() {
		name = "�⺻�̸�";
		scnum=0;
		gender="�⺻����";
	}
	public student(String name, int scnum, String gender) {
		this.name=name;
		this.scnum=scnum;
		this.gender=gender;
	}
	public void numchan (int num) {
		this.scnum=num;
	}
	public void stuinfo() {
		System.out.printf("�̸�:%s\n�й�:%d\n����:%s", name, scnum, gender);
	}
}

public class moonje0203 {

	public static void main(String[] args) {
		student[] stu=new student[2];
		stu[0]=new student("�̵���", 2009098033, "��");
		stu[1]=new student("������", 2007012034, "��");
		stu[0].numchan(2019038033);
		stu[0].stuinfo();
		stu[1].stuinfo();
	}

}
