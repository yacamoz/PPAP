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
		System.out.println(num+"�� �� �޸��� ��...");
		try {
			for(int i=0;mnum<=100;i++) {
				System.out.println(num+"�� �� �޸��� ��...�Ÿ�:"+mnum);
				mnum+=rand.nextInt(10)+1;
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num+"�� �� �� ����...");
	}
}
public class threadmain {

	public static void main(String[] args) {
		System.out.println("Start main method");
		
		Threadtost test1 = new Threadtost(1);
		Threadtost test2 = new Threadtost(2);
		Threadtost test3 = new Threadtost(3);
		Thread t1 = new Thread(test1, "ù��°");
		Thread t2 = new Thread(test2, "�ι�°");
		Thread t3 = new Thread(test3, "����°");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("End main method");

	}

}
