package padlet;

class student01{
	private String name;
	private int scnum;
	private String gender;
	
	public student01() {
		name = "�⺻�̸�";
		scnum=0;
		gender="�⺻����";
	}
	public student01(String name, int scnum, String gender) {
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

public class moonje0303 {

	public static void main(String[] args) {
		student01 stu1=new student01("�̵���",2009038033,"��");
		stu1.stuinfo();

	}

}
