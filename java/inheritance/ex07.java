package inheritance;

class car{
	String name;
	String menufac;
	double price;
	
	public car() {
		name="기본차";
		menufac="아무제조사";
		price = 0;
	}
	public car(String name, String menufac, double price) {
		this.name = name;
		this.menufac=menufac;
		this.price=price;
	}
	public void introduce() {
		System.out.printf("이름:%s\n", name);
		System.out.printf("제조사:%s\n", menufac);
		System.out.printf("가격:%.1f\n", price);
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
		System.out.printf("적재가능량%.1fkg\n", nweight);
		System.out.printf("적재한계량%.1fkg\n", limit);
	}
	public void check() {
		if(nweight>limit) {
			System.out.printf("%s:적재량이 너무 많습니다. 초과된 적재량:%.1fkg\n",name, nweight-limit);
		}
		else if (nweight<=limit) {
			System.out.printf("%s:기준을 잘 따랐습니다 남은 용량:%.1fkg\n",name, limit-nweight);
		}
	}
}

public class ex07 {

	public static void main(String[] args) {
		truck[] tk1=new truck[3];
		tk1[0]=new truck("헤비뚜럭","불보",10000, 1500, 1000);
		tk1[1]=new truck("미디뚜럭","뽀드",5000,1000,1000);
		tk1[2]=new truck("스몰뚜럭","키아",7000,900,1000);
		
		for(int i=0;i<3;i++) {
			tk1[i].introduce();
		}
		for(int i=0;i<3;i++) {
			tk1[i].check();
		}
	}

}
