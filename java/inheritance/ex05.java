package inheritance;

class police{
	private String name;
	private String rank;
	
	public police(){
	name="����1";
	rank="�ǰ�";
	}
	
	public police(String name, String rank) {
		this.name = name;
		this.rank=rank;
	}
	public void fire(int num, gun g1) {
		System.out.printf("%s��/�� %d�� �߻�!\n",name, num);
		g1.shot(num);
	}
}

class gun{
	private int ammo;
	public gun() {
		ammo=0;
	}
	public gun(int ammo) {
		this.ammo=ammo;
	}
	public void shot(int num) {
		for(int i = 1;i<=num;i++) {
			System.out.printf("Bang!");
			ammo--;
			if(ammo<=0) {
				System.out.print("\n�������� �ʿ�!");
				break;
			}
		}
	}
	public void reload(int num) {
		System.out.printf("%dammo Reload!",num);
		ammo=num;
	}
	
}

class gunin{
	//has-a ����, �ٸ� Ŭ������ �̸� ���� ���ѹ�����
	private gun g;
	public gunin() {
		g=new gun(30);
	}
	public void fire(int num) {
		g.shot(num);
	}
}

public class ex05 {

	public static void main(String[] args) {
		police p1 = new police("�ع�","���");
		gun g1 = new gun(12);
		gunin gi = new gunin();
		p1.fire(13, g1);
		g1.reload(12);
		p1.fire(12, g1);
		gi.fire(29);
	}

}
