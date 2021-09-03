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
			System.out.println("사과가 부조카당");
			return 0;
		}
		else {
		numOfApple -= num;
		myMoney += money;
		return num;}
	}
	
	public void showSaleResult()
	{
		System.out.println("***판매자 현황***");
		System.out.println("남은 사과:"+numOfApple);
		System.out.println("판매 수익:"+myMoney);
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
			System.out.println("잔액이 부족합니다");
		}
		else if(money%1000!=0) {
			System.out.println("맞지 않은 금액입니다");
		}
		else if(seller.saleApple(money)==0) {
			System.out.println("현황을 파악해보아용");
		}
		else {
			numOfApple+=money/1000;
			myMoney-=money;
		}
	}
	
	public void showBuyResult()
	{
		System.out.println("***구매자 현황***");
		System.out.println("현재 잔액:"+myMoney);
		System.out.println("사과 개수:"+numOfApple);
	}
}


public class applesell {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20,0);
		FruitBuyer buyer = new FruitBuyer(30000,0);
		int num = 0, num1 = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.구매\n2.현황\n3.종료");
			num=sc.nextInt();
			if (num==3){
				break;}
			switch(num) {
			case 1:
				System.out.println("구입하는데 얼마를 쓸건가?");
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