package ex01;
import java.util.Scanner;

class Account{
	Scanner sc = new Scanner(System.in);
	double balance;
	int acnum;
	int acpw;
	int nopi;
	int giri;
	
	Account(int nopi, int giri){
		this.nopi = nopi;
		this.giri=giri;
	}
	
	int trnulbi(int nopi, int giri) {
		int result = 0;
		result = nopi*giri/2;
		return result;
	}
	int sqnulbi(int nopi, int giri) {
		int result = 0;
		result = nopi*giri;
		return result;
	}
	
	Account(double balance, int acnum, int acpw){
	this.balance = balance;
	this.acnum = acnum;
	this.acpw = acpw;
	}
	
	void showinfo() {
		System.out.printf("�ܾ�:%.2f\n", balance);
		System.out.printf("���¹�ȣ:%d\n", acnum);
	}
	double deposit(double num1) {
		balance+=num1;
		System.out.printf("�ܾ�:%.2f\n", balance);
		return balance;
	}
	double withdraw(double num2) {
		int innum;
		System.out.print("��й�ȣ�� �Է��ϼ���:");
		innum=sc.nextInt();
		if (innum!=acpw) {
			System.out.print("��ȣ�� Ʋ�Ƚ��ϴ�");
			return balance;
		}
		else if (balance>num2) {
			balance-=num2;
			System.out.printf("�ܾ�:%.2f", balance);
		return balance;}
		else {
			System.out.println("�ܾ��� �����մϴ�");
			return balance;
		}
	}
}

public class class_practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account(5000,11235,503);
		int num1 = 0;
		double num2 = 0;
		while(true) {
			System.out.println("�޴��� �����ϼ���\n1.�Ա�\n2.���\n3.��ȸ\n4.����");
			num1=sc.nextInt();
			if (num1==4){
				break;}
				
			switch(num1) {
			case 1:
				System.out.println("���Ա�?");
				num2 = sc.nextDouble();
				a1.deposit(num2);
				break;
			case 2:
				System.out.println("�����?");
				num2 = sc.nextDouble();
				a1.withdraw(num2);
				break;
			case 3:
				a1.showinfo();
				break;
			}
		}
	}

}
