package inheritance;

class car{
	String name;
	String menufac;
	double price;
	
	public car() {
		name="�⺻��";
		menufac="�ƹ�������";
		price = 0;
	}
	public car(String name, String menufac, double price) {
		this.name = name;
		this.menufac=menufac;
		this.price=price;
	}
	public void introduce() {
		System.out.printf("�̸�:%s\n", name);
		System.out.printf("������:%s\n", menufac);
		System.out.printf("����:%.1f\n", price);
	}
	
}

class truck extends car{
	double nweight;
	double limit;
	public truck() {
		nweight=0;
		limit = 0;
	}
	public truck(String name, String menufac, double price, double nweight, double limit) {
		super(name, menufac, price);
		this.nweight=nweight;
		this.limit=limit;
	}
	public void introduce() {
		super.introduce();
		System.out.printf("���簡�ɷ�%.1fkg\n", nweight);
		System.out.printf("�����Ѱ跮%.1fkg\n", limit);
	}
	public void check() {
		if(nweight>limit) {
			System.out.printf("%s:���緮�� �ʹ� �����ϴ�. �ʰ��� ���緮:%.1fkg\n",name, nweight-limit);
		}
		else if (nweight<=limit) {
			System.out.printf("%s:������ �� �������ϴ� ���� �뷮:%.1fkg\n",name, limit-nweight);
		}
	}
}

public class ex07 {

	public static void main(String[] args) {
		truck[] tk1=new truck[3];
		tk1[0]=new truck("���ѷ�","�Һ�",10000, 1500, 1000);
		tk1[1]=new truck("�̵�ѷ�","�ǵ�",5000,1000,1000);
		tk1[2]=new truck("�����ѷ�","Ű��",7000,900,1000);
		
		for(int i=0;i<3;i++) {
			tk1[i].introduce();
		}
		for(int i=0;i<3;i++) {
			tk1[i].check();
		}
	}

}
