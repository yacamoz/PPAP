package randomex;

import java.util.Random;

class lottery {
	private final int LOTTERY_PRICE=1000;
	private int purchase = 0;
	private int games = 0;
	private int [][]ltarr=new int [10][6];
	
	public lottery() {
		purchase=0;
		games=0;
	}
	
	public lottery(int inpurchase) {
		
		this.purchase = inpurchase;
   		this.games = inpurchase/LOTTERY_PRICE;
		 if(inpurchase%LOTTERY_PRICE!=0) {
   			this.games = 0;
   			System.out.println("액수가 맞지 않습니다.");
   		}
   		else if (inpurchase/LOTTERY_PRICE>10) {
   			this.games = 10; 
   			System.out.println("10게임이 한계입니다");
   		}
	}
	
	public void lotteryy() {
	for(int u=0;u<games;u++) {
	Random rand = new Random();
	int num = 0, tmp=0;
	int []arr = new int [6];
	for(int i = 0; i<6; i++) {
	num=rand.nextInt(45)+1;
	arr[i]=num;
	}
	for (int i = 0; i<arr.length; i++) {
		for(int j = 0; j<arr.length; j++) {
			if (i==j) {
				continue;
			}
			else if(arr[i]==arr[j]) {
			arr[i]=rand.nextInt(45)+1;
			j=0;
			i=0;
			continue;
			}
		}

			}
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i] > arr[j]) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	for(int i = 0; i<6;i++) {
		ltarr[u][i]=arr[i];
			}
		}
	}
	public void shownum() {
		for(int i=0;i<games;i++) {
			for(int u=0;u<6;u++) {
				System.out.printf("%d ", ltarr[i][u]);
			}
			System.out.print("\n");
		}
	}
}



