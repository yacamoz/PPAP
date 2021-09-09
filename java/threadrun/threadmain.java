package threadrun;

import java.util.Random;

class Threadtost implements Runnable {
	private int num;
	private int mnum;
	private int rnum;
	
	Random rand = new Random();
	
	public Threadtost() {
		
	}
	public Threadtost (int num) {
		this.num=num;
	}
	public void run () {
		System.out.println(num+"번 말 달리는 중...");
		try {
			for(int i=0;mnum<=100;i++) {
				System.out.println(num+"번 말 달리는 중...거리:"+mnum);
				mnum+=rand.nextInt(10)+1;
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num+"번 번 말 도착...");
	}
}
public class threadmain {

	public static void main(String[] args) {
		System.out.println("Start main method");
		
		Threadtost test1 = new Threadtost(1);
		Threadtost test2 = new Threadtost(2);
		Threadtost test3 = new Threadtost(3);
		Thread t1 = new Thread(test1, "첫번째");
		Thread t2 = new Thread(test2, "두번째");
		Thread t3 = new Thread(test3, "세번째");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("End main method");

	}

}
