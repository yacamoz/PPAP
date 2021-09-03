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
		numOfApple -= num;
		myMoney += money;
		return num;
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
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult()
	{
		System.out.println("***������ ��Ȳ***");
		System.out.println("���� �ܾ�:"+myMoney);
		System.out.println("��� ����:"+numOfApple);
	}
}


public class ex_fruitCode {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20,0);
		FruitBuyer buyer = new FruitBuyer(5000,0);
		
		System.out.println("---�Ǹ���---");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller, 3000);
		System.out.printf("�Ǹ��ڿ��� %d��ġ ����� �����ߴ�!\n",3000);
		
		System.out.println("---�Ǹ���---");
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
