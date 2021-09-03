package class_lecture;

import java.util.Scanner;

class FruitSeller{
	private final int APPLE_PRICE=1000;
	private int numOfApple;
	private int myMoney;
	
	public FruitSeller() {
		numOfApple=10;
		myMoney=0;
	}
	
	public FruitSeller(int numOfApple,int myMoney) {
		this.numOfApple=numOfApple;
		this.myMoney=myMoney;
	}
	
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		if(num>numOfApple||money<APPLE_PRICE) {
			System.out.println("����� ����ī��");
			return 0;
		}
		else {
		numOfApple -= num;
		myMoney += money;
		return num;}
	}
	
	public void showSaleResult()
	{
		System.out.println("***�Ǹ��� ��Ȳ***");
		System.out.println("���� ���:"+numOfApple);
		System.out.println("�Ǹ� ����:"+myMoney);
	}
}

class FruitBuyer{
	private int myMoney;
	private int numOfApple;
	
	public FruitBuyer()
	{
		myMoney=5000;
		numOfApple=0;
	}
	public FruitBuyer(int myMoney,int numOfApple)
	{
		this.myMoney=myMoney;
		this.numOfApple=numOfApple;
	}
	
	public void buyApple(FruitSeller seller, int money)
	{
		if(myMoney<money) {
			System.out.println("�ܾ��� �����մϴ�");
		}
		else if(money%1000!=0) {
			System.out.println("���� ���� �ݾ��Դϴ�");
		}
		else if(seller.saleApple(money)==0) {
			System.out.println("��Ȳ�� �ľ��غ��ƿ�");
		}
		else {
			numOfApple+=money/1000;
			myMoney-=money;
		}
	}
	
	public void showBuyResult()
	{
		System.out.println("***������ ��Ȳ***");
		System.out.println("���� �ܾ�:"+myMoney);
		System.out.println("��� ����:"+numOfApple);
	}
}


public class applesell {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20,0);
		FruitBuyer buyer = new FruitBuyer(30000,0);
		int num = 0, num1 = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.����\n2.��Ȳ\n3.����");
			num=sc.nextInt();
			if (num==3){
				break;}
			switch(num) {
			case 1:
				System.out.println("�����ϴµ� �󸶸� ���ǰ�?");
				num1=sc.nextInt();
				buyer.buyApple(seller, num1);
				break;
			case 2:
				seller.showSaleResult();
				buyer.showBuyResult();
				break;
			}
		}
	}
}